package com.escribadivino.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn ( name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn ( name = "list_id")
    private GameList list;



}
