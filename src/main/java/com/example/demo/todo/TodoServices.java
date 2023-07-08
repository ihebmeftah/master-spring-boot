package com.example.demo.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoServices {
    private static List<Todo> listOfTodos = new ArrayList<>();

    static{
        listOfTodos.add(new Todo(1, "iheb", "devops", LocalDate.now(), false));
        listOfTodos.add(new Todo(2, "iheb", "mobile", LocalDate.now().plusYears(2), false));
        listOfTodos.add(new Todo(3, "iheb", "web", LocalDate.now().plusYears(1), false));
    }
    public List<Todo> findAll(){
        return listOfTodos ;
    }
    public List<Todo> save(Todo todo){
        listOfTodos.add(todo);
        return listOfTodos ;
    }

}
