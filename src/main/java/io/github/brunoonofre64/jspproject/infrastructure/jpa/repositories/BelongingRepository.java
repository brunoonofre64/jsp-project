package io.github.brunoonofre64.jspproject.infrastructure.jpa.repositories;


import io.github.brunoonofre64.jspproject.domain.entities.BelongingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BelongingRepository extends JpaRepository<BelongingEntity, String> {
}
