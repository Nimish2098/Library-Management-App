package com.library.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.management.model.Book;
import com.library.management.repository.BookRepository;

@Service
public class BookService {
    @Autowired private BookRepository repo;
    
    public Book addBook(Book book){
        return repo.save(book);
    }

    public List<Book> listBooks(){
        return repo.findAll();
    }

    public void deleteBook(Long id){
        repo.deleteById(id);
    }

    public Optional<Book> getBook(Long id){
        return repo.findById(id);
    }
}
