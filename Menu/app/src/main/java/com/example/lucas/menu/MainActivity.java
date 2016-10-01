package com.example.lucas.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){
        //Respond to menu item selected
        switch(item.getItemId()){
            case R.id.who:
                Toast t1 = Toast.makeText(getApplicationContext(), "who", Toast.LENGTH_LONG);

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.who_toast, null);

                t1.setView(layout);
                t1.setGravity(Gravity.CENTER | Gravity.LEFT, 200, 0);
                t1.show();
                break;
            case R.id.where:
                Toast t2 = Toast.makeText(getApplicationContext(), "where", Toast.LENGTH_LONG);
                LayoutInflater inflater2 = getLayoutInflater();
                View layout2 = inflater2.inflate(R.layout.where_toast, null);
                t2.setView(layout2);
                t2.setGravity(Gravity.CENTER | Gravity.CENTER, 0, 0);
                t2.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
