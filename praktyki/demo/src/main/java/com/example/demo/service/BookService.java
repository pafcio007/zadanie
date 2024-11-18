package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final com.example.demo.repository.BookRepository BookRepository;
    private final BookRepository bookRepository;

    public BookService(com.example.demo.repository.BookRepository BookRepository, com.example.demo.repository.BookRepository bookRepository) {
        this.BookRepository = BookRepository;
        this.bookRepository = bookRepository;
    }

    //funkcja GET W POSTMAN
    public Book getBookById(long id) {
        Optional<Book> Book = BookRepository.findById(id);
        if (Book.isPresent()) {
            return Book.get();
        } else {
            return null;
        }
    }
    //funkcja DELETE W POSTMAN
    public void deleteBookById(long id) {
        BookRepository.deleteById(id);
    }

    //funkcja ADD W POSTMAN ZMIEŃ "http://localhost:8080/api/v1/book/1" NA "http://localhost:8080/api/v1/book/1" (W SKRÓCIE) ->> 1 NA 2 ZAMIENIASZ, BO INACZEJ NADPISZESZ
    public Book addBook(Book book) {
        return BookRepository.save(book);
    }
    //funkcja UPDATE W POSTMAN
    public Book updateBook(Book bookRequest) {
        Book book = bookRepository.findById(bookRequest.getId()).get();
        book.setId(bookRequest.getId());
        book.setName(bookRequest.getName());
        book.setAutor(bookRequest.getAutor());
        book.setIloscStron(bookRequest.getIloscStron());
        book.setRokWydania(bookRequest.getRokWydania());
        book.setWydawnictwo(bookRequest.getWydawnictwo());
        book.setCena(bookRequest.getCena());
        return bookRepository.save(book);
    }
}