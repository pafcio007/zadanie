package com.example.praktyki.service;

import com.example.praktyki.DTO.BookDTO;
import com.example.praktyki.DTO.MovieDTO;
import com.example.praktyki.entity.Book;
import com.example.praktyki.entity.Movie;
import com.example.praktyki.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private ModelMapper modelMapper;
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieDTO getMovieById(Long id){
        Movie movie = movieRepository.findById(id).orElse(null);
        return convertToDTO(movie);
    }

    private MovieDTO convertToDTO(Movie movie) {
        return modelMapper.map(movie, MovieDTO.class);
    }

    private Movie convertToEntity(MovieDTO movieDTO) {
        return modelMapper.map(movieDTO,Movie.class);
    }

    public void deleteById(long id){
        this.movieRepository.deleteById(id);
    }

    public void save(MovieDTO tmpMovieDTO){
        this.movieRepository.save(convertToEntity(tmpMovieDTO));
    }

//    public void insert(String title, String director, String genre, int releaseDate, float price){
//        Movie tmpMovie = new Movie();
//        tmpMovie.setTitle(title);
//        tmpMovie.setDirector(director);
//        tmpMovie.setGenre(genre);
//        tmpMovie.setReleaseDate(releaseDate);
//        tmpMovie.setPrice(price);
//        this.movieRepository.save(tmpMovie);
//    }
//
//    public void insert(Long id, String title, String director, String genre, int releaseDate, float price){
//        Movie tmpMovie = new Movie();
//        tmpMovie.setId(id);
//        tmpMovie.setTitle(title);
//        tmpMovie.setDirector(director);
//        tmpMovie.setGenre(genre);
//        tmpMovie.setReleaseDate(releaseDate);
//        tmpMovie.setPrice(price);
//        this.movieRepository.save(tmpMovie);
//    }


}
