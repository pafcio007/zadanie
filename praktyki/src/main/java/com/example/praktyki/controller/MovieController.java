package com.example.praktyki.controller;

import com.example.praktyki.DTO.MovieDTO;
import com.example.praktyki.entity.Movie;
import com.example.praktyki.service.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public MovieDTO getById(@PathVariable Long id){
        return movieService.getMovieById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        movieService.deleteById(id);
    }

    @PostMapping
    public void insert(@RequestBody MovieDTO movieDTO){
        this.movieService.save(movieDTO);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody MovieDTO movieDTO){
        this.movieService.save(movieDTO);
    }

//    public void insert(Long id, String title, String director, String genre, int releaseDate, float price){
//        Movie tmpMovie = new Movie();
//        tmpMovie.setId(id);
//        tmpMovie.setTitle(title);
//        tmpMovie.setDirector(director);
//        tmpMovie.setGenre(genre);
//        tmpMovie.setReleaseDate(releaseDate);
//        tmpMovie.setPrice(price);
//        this.movieService.save(tmpMovie);
//    }
//
//    public void changeId(Movie movie, long id){
//        Movie tmpMovie = movie;
//        tmpMovie.setId(id);
//        this.save(tmpMovie);
//    }
//
//    public void changeTitle(Movie movie, String title){
//        Movie tmpMovie = movie;
//        tmpMovie.setTitle(title);
//        this.save(tmpMovie);
//    }
//
//    public void changeDirector(Movie movie, String director){
//        Movie tmpMovie = movie;
//        tmpMovie.setDirector(director);
//        this.save(tmpMovie);
//    }
//
//    public void changeGenre(Movie movie, String genre){
//        Movie tmpMovie = movie;
//        tmpMovie.setGenre(genre);
//        this.save(tmpMovie);
//    }
//
//    public void changeReleaseDate(Movie movie, int date){
//        Movie tmpMovie = movie;
//        tmpMovie.setReleaseDate(date);
//        this.save(tmpMovie);
//    }
//
//    public void changePrice(Movie movie, float price){
//        Movie tmpMovie = movie;
//        tmpMovie.setPrice(price);
//        this.save(tmpMovie);
//    }
}
