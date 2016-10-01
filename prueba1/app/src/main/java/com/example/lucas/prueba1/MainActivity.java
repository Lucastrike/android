package com.example.lucas.prueba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            MySQLiteHelper db = new MySQLiteHelper(this);

            db.addBook(new Book("Bringing down the house", "Ben Mezrich"));
            db.addBook(new Book("El principito", "Antoine de Saint-Exupéry"));

            String title = db.getBook(2).getTitle();
            String author = db.getBook(2).getAuthor();

            TextView muestra = (TextView) findViewById(R.id.mostrar);
            muestra.setText("The title is: " + title + " and the author is: " + author);

        }

    }

