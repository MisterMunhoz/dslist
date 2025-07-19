package com.escribadivino.dslist.repositories;

import com.escribadivino.dslist.entities.Game;
import org.springframework.data.jpa.repository.*;

public interface GameRepository extends JpaRepository <Game, Long> {

}
