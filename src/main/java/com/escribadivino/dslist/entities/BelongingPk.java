package com.escribadivino.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn ( name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn ( name = "list_id")
    private GameList list;

    public BelongingPk(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPk that = (BelongingPk) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
