package io.github.brunoonofre64.jspproject.infrastructure.service;


import io.github.brunoonofre64.jspproject.domain.dto.RoleRequestDTO;
import io.github.brunoonofre64.jspproject.domain.entities.RoleEntity;
import io.github.brunoonofre64.jspproject.domain.enums.CodeMessage;
import io.github.brunoonofre64.jspproject.domain.exceptions.RoleAlreadyExistsException;
import io.github.brunoonofre64.jspproject.domain.exceptions.RoleEmptyException;
import io.github.brunoonofre64.jspproject.infrastructure.jpa.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    @Transactional
    public void save(RoleRequestDTO roleRequestDTO) {
        if (roleRequestDTO == null || roleRequestDTO.getRoleName() == null) {
            throw new RoleEmptyException(CodeMessage.ROLE_EMPTY);
        }

        RoleEntity entity = roleRequestDTO.toEntity();
        entity.setRoleName("ROLE_".concat(entity.getRoleName().toUpperCase()));

        if (roleRepository.existsByRoleName(entity.getRoleName())) {
            throw new RoleAlreadyExistsException(CodeMessage.ROLE_ALREADY_EXISTS);
        }

        roleRepository.save(entity);
    }
}
