package io.github.brunoonofre64.jspproject.api.v1.controller;

import io.github.brunoonofre64.jspproject.domain.entities.UserEntity;
import io.github.brunoonofre64.jspproject.infrastructure.jpa.repositories.UserRepository;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public ModelAndView postTest() {
        return new ModelAndView("login");
    }

    @PostMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("txtemail");
        String senha = request.getParameter("txtsenha");

        UserDetails userDetails = userService.loadUserByUsername(email);

        if (userDetails != null && passwordEncoder.matches(senha, userDetails.getPassword())) {

            UserEntity userEntity = userRepository.findByEmail(email)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));

            String sessionUser = userEntity.getName();

            HttpSession session = request.getSession();
            session.setAttribute("nome", sessionUser);

            response.sendRedirect("/user");
        } else {
            throw new UsernameNotFoundException("Senha incorreta");
        }
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        response.sendRedirect("/login");
    }
}
