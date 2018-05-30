package com.example.jomalo.countries;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTest {

    Country country;

    @Before
    public void before() {
        country = new Country(7,"France", "Paris", "French", "66.9 million");
    }

    @Test
    public void getNumberTest() {
        assertEquals((Integer)7, country.getNumber());
    }

    @Test
    public void getNameTest() {
        assertEquals((String)"France", country.getName());
    }

    @Test
    public void getCapitalTest() {
        assertEquals((String)"Paris", country.getCapital());
    }

    @Test
    public void getLanguageTest() {
        assertEquals((String)"French", country.getLanguage());
    }

    @Test
    public void getPopulationTest() {
        assertEquals((String)"66.9 million", country.getPopulation());
    }
}

