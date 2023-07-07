package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("sayhello")
    @ResponseBody
    public String sayHello() {
        return "Hello spring boot application";
    }

    @RequestMapping("sayhellojsp")
    public String sayHellojsp() {
        return "sayHello";
    }

}
