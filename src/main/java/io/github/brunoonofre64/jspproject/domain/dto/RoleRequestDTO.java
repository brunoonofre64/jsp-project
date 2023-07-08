package io.github.brunoonofre64.jspproject.domain.dto;

import io.github.brunoonofre64.jspproject.domain.entities.RoleEntity;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequestDTO {
    private String roleName;

    public RoleEntity toEntity() {
        RoleEntity entity = new RoleEntity();
        BeanUtils.copyProperties(this, entity);
        return entity;
    }
}
