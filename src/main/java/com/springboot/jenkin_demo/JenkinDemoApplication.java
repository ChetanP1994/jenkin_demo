package com.springboot.jenkin_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

	@GetMapping("/jenkin")
	public String getMessage(){
		return "Docker Jenkin Github Integration";
	}

}
