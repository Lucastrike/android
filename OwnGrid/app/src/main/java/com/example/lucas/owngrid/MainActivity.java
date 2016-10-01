package com.example.lucas.owngrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link the ListView resource
        final GridView lv = (GridView) findViewById(R.id.PairsGrid);

        //Create and populate the list
        String[] pairs = new String[] {"AUD Australia Dollar", "CAD Canada Dollar", "CHF Switzerland Franc", "EUR Eurozone Euro",
                "GBP Great Britain Pound", "JPY Japan Yen", "NZD New Zeland Dollar", "USD United States Dollar"};

        ArrayAdapter pairsList = new ArrayAdapter<String>(this, R.layout.simplerow, pairs);
        lv.setAdapter(pairsList);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ListView clicked item index
                int itemPosition = position;
                //ListView clicked item value
                String itemValue = (String) lv.getItemAtPosition(position);
                //Show position
                //                   ((TextView) view).getText() //abajo// te muestra el contenido de el array en esa posicion
                //Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(), "Aussie", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Loonie", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Swissy", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Euro", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Cable", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(getApplicationContext(), "Yen", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(), "Kiwi", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(getApplicationContext(), "Buck", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }
}
