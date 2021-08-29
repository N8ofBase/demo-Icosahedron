package com.prismcortex.Icosahedron.demo.models;

public class Weapon {

    private String name;
    private String info;
    private String dice;

    public Weapon(String name, String info, String dice) {
        this.name=name; this.info=info; this.dice=dice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDice() {
        return dice;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }

    @Override
    public String toString() {
        return name;
    }
}



