package com.example.demo.cours.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cours.Cours;

public interface CoursSpringdataJpaRepo extends JpaRepository<Cours,Long> {
    
}
