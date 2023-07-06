package com.example.demo.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.cours.jpa.CoursJpaRepo;

@Component
public class CoursCommandLineRunner implements CommandLineRunner {
    //@Autowired
    //CoursJdbcRepo repo;

    @Autowired
    CoursJpaRepo repo;
    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Cours(1, "sajed 1 jpa", "meftah"));
        repo.insert(new Cours(2, "sajed 2 jpa", "meftah"));
        repo.insert(new Cours(3, "sajed 3 jpa", "meftah"));
        repo.insert(new Cours(4, "sajed 3 jpa", "meftah"));

        System.out.println(repo.findById(3));

    }

}
