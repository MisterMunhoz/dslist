package com.escribadivino.dslist.entities;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Table (name = "tb_game")
@EqualsAndHashCode(of = "id")

public class Game {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column( name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;


    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String platforms,Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }


}
