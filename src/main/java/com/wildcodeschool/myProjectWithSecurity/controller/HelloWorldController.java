package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers....Assemble !";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "Biarritz\n" +
                "Bordeaux\n" +
                "La Loupe \n" +
                "Lille\n" +
                "Lyon\n" +
                "Marseille\n" +
                "Nantes\n" +
                "Orléans\n" +
                "Paris\n" +
                "Reims\n" +
                "Saintes\n" +
                "Strasbourg\n" +
                "Toulouse\n" +
                "Tours";
    }

}

