package com.example.demo.cours.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoursJdbcRepo {
    @Autowired
    private JdbcTemplate sprinJdbcTemplate;
    private static String INSERT_QUERY = """
                insert into course (id, name, author)
                values(1, 'Learn AWS jdbc','in28minutes');
            """;;

    public void insert(){
        sprinJdbcTemplate.update(INSERT_QUERY);
    }
}
