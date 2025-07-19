package com.escribadivino.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
