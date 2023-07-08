package io.github.brunoonofre64.jspproject.api.v1.controller;

import io.github.brunoonofre64.jspproject.domain.dto.RoleRequestDTO;
import io.github.brunoonofre64.jspproject.infrastructure.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody RoleRequestDTO roleRequestDTO) {
        roleService.save(roleRequestDTO);
    }
}
