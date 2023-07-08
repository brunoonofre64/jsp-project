package io.github.brunoonofre64.jspproject.domain.dto;

import io.github.brunoonofre64.jspproject.domain.entities.GameListEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameListDTO {
    private String id;
    private String name;

    public GameListDTO(GameListEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
