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
        coursJdbcRepo.insert(new Cours(1 ,"sajed","meftah"));
        coursJdbcRepo.insert(new Cours(2 ,"sajed","meftah"));
        coursJdbcRepo.insert(new Cours(3 ,"sajed","meftah"));
        coursJdbcRepo.insert(new Cours(4 ,"sajed","meftah"));

                coursJdbcRepo.deleteById(2);


    }

}
