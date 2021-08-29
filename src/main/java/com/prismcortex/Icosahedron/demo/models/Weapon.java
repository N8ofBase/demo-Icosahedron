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


package com.prismcortex.teah_tv.models;

public class Movie {



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

    @Entity
    public class Movies {

        @Id
        @GeneratedValue
        private int movie_id;


        private String title;


        private int year_released;


        private String director;


        private String category;


        private String disc;


        private String location;

        public Movie() {}

        public Movie(String aTitle, int aYear_released, String aDirector, String aCategory,
                     String aDisc, String aLocation) {

    public Movies(String aTitle, int aYear_released, String aDirector, String aCategory,
                    String aDisc, String aLocation) {
                this.title=aTitle; this.year_released=aYear_released; this.director=aDirector;
                this.category=aCategory; this.disc=aDisc; this.location=aLocation;
            }
    public Movies() {}


            public String getTitle() {
