package com.example.bkspringboot2webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BkSpringBoot2WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BkSpringBoot2WebserviceApplication.class, args);
    }

    @GetMapping
	public String HelloWold(){
    	return "Hello World";
	}

}




