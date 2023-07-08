package com.example.demo.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoServices todoServices;

    public TodoController(TodoServices todoServices) {
        super();

        this.todoServices = todoServices;
    }

    @RequestMapping("alltodo")
    public String routeAllTodo(ModelMap modelMap) {
        List<Todo> alltodo = todoServices.findAll();
        modelMap.addAttribute("todoList", alltodo);
        return "listtodo";
    }

    @RequestMapping(value = "addtodo" ,method = RequestMethod.GET)
    public String routeAddtodo(){
        return "addtodo";
    }

    @RequestMapping(value = "addtodo" ,method = RequestMethod.POST)
    public String routeShowtodo(){
        todoServices.save(new  Todo(4, "iheb", "V", LocalDate.now().plusYears(1), true));
        return "redirect:alltodo";
    }
}
