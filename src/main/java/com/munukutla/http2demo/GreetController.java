package com.munukutla.http2demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {
    @GetMapping("/hello")
    public @ResponseBody String getGreeting(){
        return "Hello, World";
    }
}
