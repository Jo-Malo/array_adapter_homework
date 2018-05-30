package com.example.jomalo.countries;

import java.io.Serializable;

public class Country implements Serializable{

    private Integer number;
    private String name;
    private String capital;
    private String language;
    private String population;

    public Country(Integer number, String name, String capital, String language, String population) {
        this.number = number;
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.population = population;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getLanguage() {
        return language;
    }

    public String getPopulation() {
        return population;
    }
}
