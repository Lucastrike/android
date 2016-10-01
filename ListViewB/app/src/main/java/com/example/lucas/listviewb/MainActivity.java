package com.example.lucas.listviewb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link the ListView resource
        final ListView lv = (ListView) findViewById(R.id.pList);

        //Create and populate the list
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        ArrayAdapter planetList = new ArrayAdapter<String>(this, R.layout.simplerow, planets);
        lv.setAdapter(planetList);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //ListView clicked item index
                    int itemPosition = position;
                    //ListView clicked item value
                    String itemValue = (String) lv.getItemAtPosition(position);
                    //Show position
                    Toast.makeText(getApplicationContext(), "position: " + itemPosition + " ListItem: " + itemValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}