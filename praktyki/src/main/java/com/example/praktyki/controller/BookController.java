package com.example.praktyki.controller;

import com.example.praktyki.DTO.BookDTO;
import com.example.praktyki.entity.Book;
import com.example.praktyki.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public BookDTO getById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
    }

    @PostMapping
    public void insert(@RequestBody BookDTO bookDTO) {
        this.bookService.save(bookDTO);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody BookDTO bookDTO) {
        this.bookService.save(bookDTO);
    }

}