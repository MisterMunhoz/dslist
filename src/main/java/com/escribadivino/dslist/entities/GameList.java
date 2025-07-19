package com.escribadivino.dslist.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
