package com.prismcortex.Icosahedron.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class PlayerController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="icosahedron")
        public String welcomeWithQueryParam(@RequestParam String name, @RequestParam String hero, Model model) {
        String greeting = "Welcome to the Icosahedron";
        model.addAttribute("greeting", greeting);
        return "greeting";

    }
    // handles requests of the form /icosahedron/welcome
//    @GetMapping("{name}")
//        public String welcomeWithPathParam(@PathVariable String name) {
//        return "Greetings " + name + ", welcome to the Icosahedron!";
//    }

    @GetMapping("form")
        public String heroForm() {
        return "form";
    }
@GetMapping("hero-names")
    public String heroNames(Model model) {
        List<String> heroes = new ArrayList<>();
        heroes.add("Champion");
        heroes.add("Maverick");
        heroes.add("Soul Seer");
        heroes.add("Whisper");
        model.addAttribute("heroes", heroes);
        return "hero-list";
    }

//    public static String greetPlayer(String name, String hero) {
//        String greeting = "";
//        if (hero.equals("champion")) {
//            greeting = "Greetings " + name + ", you are a Champion! A master of weapons, tactics and strength " +
//                    "with an infusion of magic to strike down enemies as well as heal allies.";
//        } else if (hero.equals("maverick")) {
//            greeting = "Greetings " + name + ", you are a Maverick! A master of archery, agility, and perception that eliminates foes " +
//                    "from a distance as well as having a keen eye for traps and hidden treasures.";
//        } else if (hero.equals("soulseer")) {
//            greeting = "Greetings " + name + ", you are a Soul Seer! A master of psychic power and energy that is harnessed " +
//                    "to torture and terrorize enemies.";
//        } else if (hero.equals("whisper")) {
//            greeting = "Greetins " + name + ", you are a Whisper! A master of the shadows that moves unseen through the darkness, " +
//                    "dispatching enemies with no sound above a whisper.";
//        }
//        return greeting;
//    }

}
