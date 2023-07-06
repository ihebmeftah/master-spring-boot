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
        coursJdbcRepo.insert();
    }

}
