package com.library.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.management.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
}


