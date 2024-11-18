package com.example.praktyki.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MovieDTO {
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
