package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
    @Autowired
    private CurrencyServicecConfig CurrencyServicecConfig;

    @RequestMapping("/currency-config")
    public CurrencyServicecConfig getAllCourses() {
        return CurrencyServicecConfig;
    }
}
