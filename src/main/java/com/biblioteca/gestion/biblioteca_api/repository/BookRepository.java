package com.biblioteca.gestion.biblioteca_api.repository;

import com.biblioteca.gestion.biblioteca_api.model.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    @SuppressWarnings("null")
    Optional<Book> findById(Long id);

    List<Book> findByAuthor(String author);
}
