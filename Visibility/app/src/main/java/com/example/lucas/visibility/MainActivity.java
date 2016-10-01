package com.example.lucas.visibility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton1 (View v){
        Button button1 = (Button) findViewById(R.id.button1);
        ImageView image1 = (ImageView) findViewById(R.id.image1);

        button1.setVisibility(View.INVISIBLE);
        image1.setVisibility(View.VISIBLE);
    }

    public void clickImage1 (View v){
        Button button1 = (Button) findViewById(R.id.button1);
        ImageView image1 = (ImageView) findViewById(R.id.image1);

        button1.setVisibility(View.VISIBLE);
        image1.setVisibility(View.INVISIBLE);
    }
}
