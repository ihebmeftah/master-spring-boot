package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private LoginService loginService;
    
    @RequestMapping(value="login" , method = RequestMethod.GET)
    public String routelogin(){
        return "login";
    }

    
   public LoginController(LoginService loginService) {
    this.loginService = loginService;
}


 @RequestMapping(value="login" , method = RequestMethod.POST)
    public String routeWelcome(@RequestParam String name,@RequestParam String password,ModelMap modelMap){
       if (loginService.authenticate(name, password)) {
        modelMap.put("name", name);
        modelMap.put("password", password);
        return "welcome";
       } 
        modelMap.put("error", "Invalid");
        return "login";
       
    }
}
