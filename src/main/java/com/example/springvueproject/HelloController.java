package com.example.springvueproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    //@RequestMapping("/hello")
    public String sayHi(){
        return "index";
    }

}
