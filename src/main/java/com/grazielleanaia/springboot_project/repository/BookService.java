package com.grazielleanaia.springboot_project.repository;

import com.grazielleanaia.springboot_project.entity.Book;

import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBooks();

    Book findBookById(Long id);

    void addBook(Book book);

    void deleteAllData();


}
