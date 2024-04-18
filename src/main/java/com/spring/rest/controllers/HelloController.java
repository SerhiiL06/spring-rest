package com.spring.rest.controllers;


import com.spring.rest.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public TestDto hello() {
            TestDto test = new TestDto();

            test.setAge(10);
            test.setName("Serhii");
        return test;
    }
}
