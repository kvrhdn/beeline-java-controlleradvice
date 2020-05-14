package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MyController {

    @GetMapping("foo")
    public String getFoo() {
        throw new ExceptionWithHandler("Something bad happened while getting foo");
    }

    @GetMapping("bar")
    public String getBar() {
        throw new ExceptionWithoutHandler("Something bad happened while getting bar");
    }
}
