package com.escribadivino.dslist.dto;

import com.escribadivino.dslist.entities.GameList;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        BeanUtils.copyProperties(entity,this);
    }
}
