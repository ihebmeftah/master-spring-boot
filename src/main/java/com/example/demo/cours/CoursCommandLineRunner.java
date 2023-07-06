package com.example.demo.cours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.cours.jdbc.CoursJdbcRepo;

@Component
public class CoursCommandLineRunner implements CommandLineRunner {
    @Autowired
    CoursJdbcRepo coursJdbcRepo;

    @Override
    public void run(String... args) throws Exception {
        coursJdbcRepo.insert(new Cours(1, "sajed 1", "meftah"));
        coursJdbcRepo.insert(new Cours(2, "sajed 2", "meftah"));
        coursJdbcRepo.insert(new Cours(3, "sajed 3", "meftah"));
        coursJdbcRepo.insert(new Cours(4, "sajed 3", "meftah"));

        System.out.println(coursJdbcRepo.findById(3));

    }

}
