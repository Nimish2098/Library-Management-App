package com.library.management.model;

import java.time.LocalDate;

import jakarta.persistence.*; // ✅ For Spring Boot 3+
import lombok.Data;
public class Issue {
        private long id;
        private Book book;
        private User user;
        private LocalDate issueDate;
    

}
