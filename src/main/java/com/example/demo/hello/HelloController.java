package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public Hello helloEndpoint(){
        return new Hello("hello world")  ;
    }

    @GetMapping("/{id}")
    public Hello helloPathVariabaleEndpoint(@PathVariable String id){
        return new Hello("hello world " + id)  ;
    }
}
