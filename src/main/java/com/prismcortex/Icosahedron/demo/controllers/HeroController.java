package com.prismcortex.Icosahedron.demo.controllers;

import com.prismcortex.Icosahedron.demo.data.HeroData;
import com.prismcortex.Icosahedron.demo.models.Hero;
import com.prismcortex.Icosahedron.demo.models.HeroType;
import com.prismcortex.Icosahedron.demo.models.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("heroes")
public class HeroController {



    @GetMapping
    public String displayHeroes(Model model) {
        model.addAttribute("heroes", HeroData.getAll());
        return "heroes/hero-list";
    }
    @GetMapping("create")
    public String renderCreateHeroForm(Model model) {
        model.addAttribute("title", "Create Hero");
        model.addAttribute(new Hero());
        model.addAttribute("types", HeroType.values());
        return "heroes/create";
    }
    @PostMapping("create")
    public String createHero(@ModelAttribute @Valid Hero newHero, Errors errors, Model model) {
        if (errors.hasErrors()){
            model.addAttribute("title,", "Create Hero");
            return "heroes/create";
        }
        if (newHero.getRole().equals("Champion")) {
            newHero.setInfo("A warrior infused with magical power to strike down rivals and heal allies");
            newHero.setLife(42);
            newHero.setAttack(3);
            newHero.setDefense(15);
            newHero.setMagic(3);
            newHero.setSpeed(1);
            newHero.setCharm(1);
            newHero.setWeapon(new Weapon("Broadsword", "Slice and Stab", "D6"));
            newHero.setStatus("Alive");
            HeroData.add(newHero);

        } else if (newHero.getRole().equals("Maverick")) {
            newHero.setInfo("An archery expert quick on their feet, able to eliminate rivals from a distance. " +
                    "Their intuition helps discover hidden traps and treasures");
            newHero.setLife(35);
            newHero.setAttack(2);
            newHero.setDefense(14);
            newHero.setMagic(1);
            newHero.setSpeed(3);
            newHero.setCharm(2);
            newHero.setWeapon(new Weapon("Longbow", "Range and Pierce", "D6"));
            newHero.setStatus("Alive");
            HeroData.add(newHero);

        } else if (newHero.getRole().equals("Soul Seer")) {
            newHero.setInfo("A being surging with psychic power, capable of inflicting torture and terror upon their rivals");
            newHero.setLife(29);
            newHero.setAttack(1);
            newHero.setDefense(12);
            newHero.setMagic(3);
            newHero.setSpeed(2);
            newHero.setCharm(2);
            newHero.setWeapon(new Weapon("Mace", "Smash and Slam", "D6"));
            newHero.setStatus("Alive");
            HeroData.add(newHero);

        } else if (newHero.getRole().equals("Whisper")) {
            newHero.setInfo("A dark figure that moves through the shadows, dispatching rivals with no sound above a whisper");
            newHero.setLife(31);
            newHero.setAttack(3);
            newHero.setDefense(14);
            newHero.setMagic(1);
            newHero.setSpeed(2);
            newHero.setCharm(2);
            newHero.setWeapon(new Weapon("Bone Dagger", "Slice and Stab", "D6"));
            newHero.setStatus("Alive");
            HeroData.add(newHero);
        }
        HeroData.add(newHero);
        return "redirect:";
    }

    @GetMapping("dead")
    public String displayDeadHeroes(Model model) {
        model.addAttribute("title", "Dead Heroes");
        model.addAttribute("heroes", HeroData.getByStatus("DEAD"));
        return "heroes/dead";
    }

    @PostMapping("dead")
    public String killingHero(@RequestParam Hero [] killHeroes) {

        for (Hero hero : killHeroes)
            HeroData.kill(hero);
        return "redirect:";
    }

}
