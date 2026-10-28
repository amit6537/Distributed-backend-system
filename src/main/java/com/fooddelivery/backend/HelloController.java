package com.fooddelivery.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Food Delivery Backend is running!";
    }
    public void mike(){
        String a ="asdfsdfadfsdf";
        return;
    }
    public void  raj(){
        String b ="raj";
        return;
    }

}