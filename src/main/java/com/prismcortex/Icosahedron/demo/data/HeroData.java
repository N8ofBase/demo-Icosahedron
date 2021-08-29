package com.prismcortex.Icosahedron.demo.data;

import com.prismcortex.Icosahedron.demo.models.Hero;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HeroData {


    private static final Map<Integer, Hero> heroes = new HashMap<>();
    private static final Map<Integer, Hero> deadHeroes = new HashMap<>();

    public static Collection<Hero> getAll() {

        return heroes.values();
    }

    public static Hero getById(int id) {
        return heroes.get(id);
    }

    public static Hero getByStatus(String status) {
        return heroes.get(status);
    }

    public static void add(Hero hero) {
        heroes.put(hero.getId(), hero);
    }
    public static void kill(Hero hero) {
        hero.die();
        heroes.put(hero.getId(), hero);
    }

}
