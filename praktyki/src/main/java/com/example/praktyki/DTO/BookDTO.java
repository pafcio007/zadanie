package com.example.praktyki.DTO;

import com.example.praktyki.entity.Movie;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

public class BookDTO {
    private String title;
    private int releaseDate;
    private String author;
    private float price;

    public void setTitle(String title){
        this.title = title;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public int getReleaseDate(){
        return this.releaseDate;
    }

    public String getAuthor(){
        return this.author;
    }

    public Float getPrice(){
        return this.price;
    }
}
