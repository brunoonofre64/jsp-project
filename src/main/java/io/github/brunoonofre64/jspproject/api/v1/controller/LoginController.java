package io.github.brunoonofre64.jspproject.api.v1.controller;

import io.github.brunoonofre64.jspproject.infrastructure.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;
    private final BCryptPasswordEncoder passwordEncoder;

    @GetMapping
    public ModelAndView postTest() {
        return new ModelAndView("login");
    }

    @PostMapping
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuario = request.getParameter("txtusuario");
        String senha = request.getParameter("txtsenha");

        UserDetails userDetails = userService.loadUserByUsername(usuario);

        if (userDetails != null && passwordEncoder.matches(senha, userDetails.getPassword())) {
            response.sendRedirect("/user");
        } else {
            throw new UsernameNotFoundException("Senha incorreta");
        }
    }
}
