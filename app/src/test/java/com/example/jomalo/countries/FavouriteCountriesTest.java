package com.example.jomalo.countries;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FavouriteCountriesTest {

    @Test
    public void getCountryListTest() {
        FavouriteCountries favouriteCountries = new FavouriteCountries();
        assertEquals(3, favouriteCountries.getList().size());
    }
}
