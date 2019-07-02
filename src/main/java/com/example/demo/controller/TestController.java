package com.example.demo.controller;


import com.example.demo.bean.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pc")
public class TestController {

    @RequestMapping("/one/{num}")

    public Person one(@PathVariable("num") Integer num, @RequestBody Person person) {
        System.out.println(num);
        return person;
    }

}
