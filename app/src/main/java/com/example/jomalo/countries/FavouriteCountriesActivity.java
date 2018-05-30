package com.example.jomalo.countries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteCountriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_countries);

        FavouriteCountries favouriteCountries = new FavouriteCountries();
        ArrayList<Country> list = favouriteCountries.getList();

        FavouriteCountriesAdapter countryAdapter = new FavouriteCountriesAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(countryAdapter);
    }

    public void onListItemClick(View listItem) {
        Country country = (Country) listItem.getTag();
        Log.d("Country Name: ", country.getName());

        Intent intent = new Intent(this, CountryActivity.class);
        intent.putExtra("country", country);
        startActivity(intent);
    }

}
