package com.biblioteca.gestion.biblioteca_api.repository;

import com.biblioteca.gestion.biblioteca_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

