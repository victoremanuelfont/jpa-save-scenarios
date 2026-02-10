package com.ufc.estudo.repositories;

import com.ufc.estudo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
