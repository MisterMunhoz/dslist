package com.escribadivino.dslist.services;

import java.util.*;

import com.escribadivino.dslist.dto.GameMinDTO;
import com.escribadivino.dslist.entities.Game;
import com.escribadivino.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList ();
   }
}

