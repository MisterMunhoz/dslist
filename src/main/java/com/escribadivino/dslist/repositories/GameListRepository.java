package com.escribadivino.dslist.repositories;

import com.escribadivino.dslist.entities.GameList;
import org.springframework.data.jpa.repository.*;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
