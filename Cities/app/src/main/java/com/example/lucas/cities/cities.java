package com.example.lucas.cities;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lucas on 20/04/2016.
 */
public class cities extends BaseAdapter {

    private Activity MyActivity;

    //Keep all images in array
    public Integer[] cityImag = {
            R.drawable.newyork, R.drawable.prague,
            R.drawable.riodejaneiro, R.drawable.lisbon,
            R.drawable.london, R.drawable.paris,
            R.drawable.rome
    };

    public String[] cities = {
            "New York", "Prague", "Rio de Janeiro", "Lisbon", "London", "Paris", "Rome"
    };

    public String[] countries = {
            "United States", "Czech Republic", "Brazil", "Portugal", "United Kingdom", "France", "Italy"
    };

    public cities (Activity c){
        MyActivity = c;
    }

    @Override
    public int getCount() {
        return cityImag.length;
    }

    @Override
    public Object getItem(int position) {
        return cityImag[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = MyActivity.getLayoutInflater();
        ImageView imageView = new ImageView(MyActivity);
        imageView.setImageResource(cityImag[position]);

        View layout = inflater.inflate(R.layout.list_design, null);
        ImageView imgid = (ImageView) layout.findViewById(R.id.imageID);
        TextView city = (TextView) layout.findViewById(R.id.cityID);
        TextView country = (TextView) layout.findViewById(R.id.countryID);

        imgid.setImageResource(cityImag[position]);
        city.setText(cities[position]);
        country.setText(countries[position]);
        return layout;
    }
}
