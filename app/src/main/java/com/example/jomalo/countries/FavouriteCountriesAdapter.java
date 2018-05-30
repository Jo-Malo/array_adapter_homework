package com.example.jomalo.countries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FavouriteCountriesAdapter extends ArrayAdapter<Country> {

    public FavouriteCountriesAdapter(Context context, ArrayList<Country> countries) {
        super(context, 0, countries);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.countries_item, parent, false);
        }

        Country currentCountry = getItem(position);

        TextView number = (TextView) listItemView.findViewById(R.id.number);
        number.setText(currentCountry.getNumber().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentCountry.getName().toString());

        TextView capital = (TextView) listItemView.findViewById(R.id.capital);
        capital.setText(currentCountry.getCapital().toString());

        TextView language = (TextView) listItemView.findViewById(R.id.language);
        language.setText(currentCountry.getLanguage().toString());

        TextView population = (TextView) listItemView.findViewById(R.id.population);
        population.setText(currentCountry.getPopulation().toString());

        listItemView.setTag(currentCountry);

        return listItemView;
    }
}
