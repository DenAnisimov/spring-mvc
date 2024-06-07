package org.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "firstname", required = false) String firstName,
                        @RequestParam(value = "secondname", required = false) String secondName) {

        System.out.println(firstName + " " + secondName);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "first/goodbye";
    }
}
