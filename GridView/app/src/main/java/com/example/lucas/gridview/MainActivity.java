package com.example.lucas.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link the ListView resource
        final GridView lv = (GridView) findViewById(R.id.ABCgrid);

        //Create and populate the list
        String[] ABC = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        ArrayAdapter planetList = new ArrayAdapter<String>(this, R.layout.simplerow, ABC);
        lv.setAdapter(planetList);
        
        //                                                   Use android libraries to do not create a custom xml
        //ArrayAdapter planetsGrid = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, planets);
        //grid.setAdapter(planetsGrid);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ListView clicked item index
                int itemPosition = position;
                //ListView clicked item value
                String itemValue = (String) lv.getItemAtPosition(position);
                //Show position
                Toast.makeText(getApplicationContext(),((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
