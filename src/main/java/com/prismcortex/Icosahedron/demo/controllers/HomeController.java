package com.prismcortex.Icosahedron.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String chooseHero() {
        return "welcome";
    }
}
