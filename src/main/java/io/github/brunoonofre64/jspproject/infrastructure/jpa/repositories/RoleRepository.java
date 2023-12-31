package io.github.brunoonofre64.jspproject.infrastructure.jpa.repositories;

import io.github.brunoonofre64.jspproject.domain.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, String> {
    boolean existsByRoleName(String roleName);
    List<RoleEntity> findByIdIn(List<String> roleId);
}
