package com.library.management.service;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.management.model.Book;
import com.library.management.model.Issue;
import com.library.management.repository.*;
@Service
public class IssueService {

    
    @Autowired private IssueRepository issueRepo;
    @Autowired private BookRepository bookRepo;

    public Issue issueBook(Long userId, Long bookId) {
        Book book = bookRepo.findById(bookId).orElseThrow();
        if (!book.isAvailable()) throw new RuntimeException("Book not available");

        Issue issue = new Issue();
        issue.setBook(book);
        issue.setIssueDate(LocalDate.now());
        // Set user manually or fetch from DB
        issue.setReturnDate(null);
        book.setAvailable(false);
        bookRepo.save(book);
        return issueRepo.save(issue);
    }

    public void returnBook(Long issueId) {
        Issue issue = issueRepo.findById(issueId).orElseThrow();
        issue.setReturnDate(LocalDate.now());
        Book book = issue.getBook();
        book.setAvailable(true);
        bookRepo.save(book);
        issueRepo.save(issue);
    }
    
}
