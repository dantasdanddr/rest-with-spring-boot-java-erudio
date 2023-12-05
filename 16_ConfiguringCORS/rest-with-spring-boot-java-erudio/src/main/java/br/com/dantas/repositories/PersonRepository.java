package br.com.dantas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dantas.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
