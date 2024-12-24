package com.grazielleanaia.springboot_project.service;

import com.grazielleanaia.springboot_project.entity.Book;
import com.grazielleanaia.springboot_project.repository.BookService;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class BookServiceImpl implements BookService {

    HashSet<Book> bookList = new HashSet<Book>();

    @Override
    public HashSet<Book> findAllBooks() {
        if (bookList.isEmpty()) {
            return null;
        } else {
            return bookList;
        }
    }

    @Override
    public Book findBookById(Long id) {
        Book book = bookList.stream().filter(b -> b.getId() == id).
                findAny().orElse(null);
        return book;
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public void deleteAllData() {
        bookList.clear();
    }

}
