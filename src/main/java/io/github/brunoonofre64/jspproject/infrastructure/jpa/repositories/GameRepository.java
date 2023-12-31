package io.github.brunoonofre64.jspproject.infrastructure.jpa.repositories;

import io.github.brunoonofre64.jspproject.domain.entities.GameEntity;
import io.github.brunoonofre64.jspproject.infrastructure.jpa.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, String> {

    @Query("SELECT g FROM GameEntity g JOIN BelongingEntity b " +
            "ON g.id = b.belongingPK.game.id WHERE b.belongingPK.gameList.id = :listId " +
            "ORDER BY b.position")
    List<GameMinProjection> searchByList(String listId);
    @Override
    Optional<GameEntity> findById(String id);
}
