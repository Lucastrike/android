package com.example.lucas.stark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.list_view);

        final Members comprobar = new Members(this);

        lista.setAdapter(comprobar);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ImageView img = (ImageView) view.findViewById(R.id.check);

                if(comprobar.comprobacion[position] == 0){
                    img.setImageResource(R.drawable.wrong);
                    comprobar.comprobacion[position] = 1;
                }else if (comprobar.comprobacion[position] == 1){
                    img.setImageResource(R.drawable.check);
                    comprobar.comprobacion[position] = 0;
                }


            }
        });
    }
}
