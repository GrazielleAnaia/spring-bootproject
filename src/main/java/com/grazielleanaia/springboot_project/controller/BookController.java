package com.grazielleanaia.springboot_project.controller;

import com.grazielleanaia.springboot_project.entity.Book;
import com.grazielleanaia.springboot_project.service.BookServiceImpl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/book")
public class BookController {


    private final BookServiceImpl bookServiceImpl;

    public BookController(BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }

    @PostMapping("/")

//    public void addBook(@RequestBody Book book) {
//        bookServiceImpl.addBook(book);
//    }

    public ResponseEntity<Void> addBook(@RequestBody Book book) {
        bookServiceImpl.addBook(book);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findall")
    public HashSet<Book> findAllBooks() {
        return bookServiceImpl.findAllBooks();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookServiceImpl.findBookById(id));

    }

    @DeleteMapping("/delete")
    public void deleteBook() {
        bookServiceImpl.deleteAllData();
    }

}

