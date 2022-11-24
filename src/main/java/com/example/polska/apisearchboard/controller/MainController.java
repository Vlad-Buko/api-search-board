package com.example.polska.apisearchboard.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Vladislav Domaniewski
 */

@Controller
public class MainController {

    @GetMapping("/hello")
    public String name() {
        return "Hello";
    }
}
