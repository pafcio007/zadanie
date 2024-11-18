package com.example.praktyki.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private long id;
    private String title;
    private int releaseDate;
    private String director;
    private String genre;
    private float price;

    public void setTitle(String title){
        this.title = title;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setPrice(float price){
        this.price = price;
    }
}
