package com.example.jomalo.countries;

import java.util.ArrayList;

public class FavouriteCountries {

    private ArrayList<Country> list;

    public FavouriteCountries() {
        list = new ArrayList<Country>();
        list.add(new Country(1,"Ecuador", "Quito", "Spanish", "16.39 million"));
        list.add(new Country(2,"New Zealand", "Wellington", "English", "4.693 million"));
        list.add(new Country(3,"Oman", "Muscat", "Arabic", "4.425 million"));
        list.add(new Country(4, "Tibet", "Lhasa", "Tibeto-Burman", "3.18 million"));
        list.add(new Country(5, "Japan", "Tokyo", "Japanese", "127 million"));
        list.add(new Country(6, "Montenegro", "Podgorica", "Serbian", "622,781"));
        list.add(new Country(7, "China", "Beijing", "Mandarin", "1.379 billion"));
        list.add(new Country(8, "Hungary", "Budapest", "Hungarian", "9.818 million"));
        list.add(new Country(9, "Argentina", "Buenos Aires", "Spanish", "43.85 million"));
        list.add(new Country(10, "United States", "Washington DC", "English", "325.7 million"));
        list.add(new Country(11, "Namibia", "Windhoek", "German", "2.48 million"));
        list.add(new Country(12, "Thailand", "Bangkok", "Thai", "68.86 million"));
        list.add(new Country(13, "Bolivia", "La Paz", "Spanish", "10.89 million"));

    }

    public ArrayList<Country> getList() {
        return new ArrayList<Country>(list);
    }
}
