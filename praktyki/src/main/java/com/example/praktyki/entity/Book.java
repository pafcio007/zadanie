package com.example.praktyki.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;
    private String title;
    private int releaseDate;
    private String author;
    private float price;

    @OneToMany(targetEntity = Movie.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "book_id")
    private List<Movie> movie;

//    public void setId(long id){
//        this.id = id;
//    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(Float price){
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
