package com.example.lucas.cities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_design);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        cities cities = new cities(this);

        LayoutInflater inflater = getLayoutInflater();

        //View layout = inflater.inflate(R.layout.list_design, null);
        ImageView imgid = (ImageView) findViewById(R.id.imageID);
        TextView city = (TextView) findViewById(R.id.cityID);
        TextView country = (TextView) findViewById(R.id.countryID);

        imgid.setImageResource(cities.cityImag[position]);
        city.setText(cities.cities[position]);
        country.setText(cities.countries[position]);
    }
}
