package com.example.demo.cours.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cours.Cours;

public interface CoursSpringdataJpaRepo extends JpaRepository<Cours,Long> {
    List<Cours> findByAuthor(String author);
    List<Cours> findByName(String name);

}
