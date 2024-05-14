package com.springboot.jenkin_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkiController {
    @GetMapping("/jenkins")
    public String getMessages(){
        return "From Codebase->>Github->>Jenkin->>Docker welcome";
    }
}
