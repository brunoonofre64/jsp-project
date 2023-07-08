package io.github.brunoonofre64.jspproject.api.v1.controller;


import io.github.brunoonofre64.jspproject.domain.dto.PasswordDTO;
import io.github.brunoonofre64.jspproject.domain.dto.UserDTO;
import io.github.brunoonofre64.jspproject.domain.dto.UserRequestDTO;
import io.github.brunoonofre64.jspproject.domain.dto.UserUpdateDTO;
import io.github.brunoonofre64.jspproject.infrastructure.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserDTO save(@RequestBody UserRequestDTO userRequestDTO) {
        return userService.save(userRequestDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping
    public UserDTO update(@RequestParam(required = false) String email, @RequestBody UserUpdateDTO userUpdateDTO) {
        return userService.update(email, userUpdateDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void delete(@RequestParam String email,@RequestBody PasswordDTO password) {
        userService.delete(email, password);
    }

    @GetMapping
    public ModelAndView findAll() {
        List<UserDTO> users = userService.findAll();
        ModelAndView modelAndView = new ModelAndView("usuario");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
