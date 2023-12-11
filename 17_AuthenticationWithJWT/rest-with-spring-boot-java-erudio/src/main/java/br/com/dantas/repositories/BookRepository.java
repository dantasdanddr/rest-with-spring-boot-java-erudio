package br.com.dantas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dantas.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
