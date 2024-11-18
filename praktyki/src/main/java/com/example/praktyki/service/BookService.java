package com.example.praktyki.service;

import com.example.praktyki.DTO.BookDTO;
import com.example.praktyki.entity.Book;
import com.example.praktyki.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private ModelMapper modelMapper;
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    public Book getBookById(Long id){
//        Optional<Book> book = bookRepository.findById(id);
//        if(book.isPresent()) {
//            return book.get();
//        } else {
//            return null;
//        }
//    }



    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        return convertToDTO(book);
    }

    private BookDTO convertToDTO(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    private Book convertToEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO,Book.class);
    }

    public void deleteById(long id){
        this.bookRepository.deleteById(id);
    }

    public void save(BookDTO bookDTO){
        this.bookRepository.save(convertToEntity(bookDTO));
    }
    }