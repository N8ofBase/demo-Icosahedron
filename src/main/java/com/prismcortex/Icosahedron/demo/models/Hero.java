package com.prismcortex.Icosahedron.demo.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.awt.*;

public class Hero {

    private int id;
    private static int nextId = 1;

    @NotBlank(message= "Name is required")
    @Size(min = 3, max = 50, message = "Name must be 3 - 50 characters.")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String playerEmail;

    private HeroType role;


    private String info;
    private Integer life;
    private Integer defense;
    private Integer attack;
    private Integer magic;
    private Integer speed;
    private Integer charm;
    private Object weapon;
    private String status;


    public Hero(String name, String playerEmail, HeroType role, String info, Integer life, Integer attack, Integer defense, Integer magic, Integer speed, Integer charm, Object weapon, String status) {
        this(); this.name = name; this.playerEmail=playerEmail; this.role= role; this.info = info; this.life = life; this.attack = attack; this.defense = defense;
        this.magic=magic; this.speed=speed; this.charm=charm; this.weapon=weapon; this.status=status; this.id=nextId; nextId++;
    }

    public Hero() {
    this.id=nextId;
    nextId++; }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroType getRole() {
        return role;
    }

    public void setRole(HeroType role) {
        this.role = role;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    public Object getWeapon() {
        return weapon;
    }

    public void setWeapon(Object weapon) {
        this.weapon = weapon;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }

    @Override
    public String toString() {
        return name;
    }

    public void die() {
        this.life = 0;
        this.status = "DEAD";
    }
}
