package io.github.brunoonofre64.jspproject.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tb_game_list")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameListEntity {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    private String name;

    @PrePersist
    private void prePersis() {
        this.id = UUID.randomUUID().toString();
    }
}
