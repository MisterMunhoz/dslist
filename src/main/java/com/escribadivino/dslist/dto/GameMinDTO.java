package com.escribadivino.dslist.dto;

import com.escribadivino.dslist.entities.Game;
import lombok.*;

@Getter

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO (){
    }

    public GameMinDTO (Game entity) {

        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();

    }


}