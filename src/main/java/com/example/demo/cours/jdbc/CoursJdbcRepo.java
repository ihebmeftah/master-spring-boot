package com.example.demo.cours.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.cours.Cours;

@Repository
public class CoursJdbcRepo {
    @Autowired
    private JdbcTemplate sprinJdbcTemplate;
    private static String INSERT_QUERY = """
                insert into course (id, name, author)
                values(?, ?,?);
            """;

    private static String DELETE_QUERY = """
                delete from course
                where id = ?
            """;
    private static String SELECT_QUERY = """
                SELECT * FROM COURSE 
                where id = ?
            """;

    public void insert(Cours cours){
        sprinJdbcTemplate.update(INSERT_QUERY , cours.getId(),cours.getName(),cours.getAuthor());
    }

    public void deleteById(long id){
        sprinJdbcTemplate.update(DELETE_QUERY ,id );
    }

    
    public Cours findById(long id){
       return sprinJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Cours.class) , id);
    }
}
