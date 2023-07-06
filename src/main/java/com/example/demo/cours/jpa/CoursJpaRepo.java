package com.example.demo.cours.jpa;

import org.springframework.stereotype.Repository;

import com.example.demo.cours.Cours;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CoursJpaRepo {
    @PersistenceContext
   private EntityManager entityManager;
   
   public void insert(Cours cours){
    entityManager.merge(cours);
   }

   public Cours findById(long id){
    return entityManager.find(Cours.class,id);
   }

    public void remove(long id){
    Cours coursRemove= entityManager.find(Cours.class,id);
    entityManager.remove(coursRemove);
   }
}
