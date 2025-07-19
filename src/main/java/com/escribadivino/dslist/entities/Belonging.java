package com.escribadivino.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();

    private Integer position;

    public Belonging(Game game, GameList list , Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }
}
