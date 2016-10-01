package com.example.lucas.sassygrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int[] ListFotos = new int[]{
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
    };

    double notas[] = new double[ListFotos.length];

    int posicion;

    int numVotes[] = new int[ListFotos.length];

    double maxNotas[] = new double[ListFotos.length];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Campuramos el ImageView y el text view nota
        ImageView imageView = (ImageView) findViewById(R.id.showImage);
        TextView textGrade = (TextView) findViewById(R.id.gradeToShow);

        //hacemos la funcion random
        posicion = generateRandom(9);

        //Volcamos el drawable aleatorio
        imageView.setImageResource(ListFotos[posicion]);
        String notaAMostrar = String.valueOf(notas[posicion]);
        textGrade.setText("Esta imagen tiene de nota: "+notaAMostrar);

    }


    public void setGrade1(View v){
        //añadimos a la nota maxima
        maxNotas[posicion] = maxNotas[posicion] + 1;

        //sumamos uno a el conteo
        numVotes[posicion]++;
        notas[posicion] = maxNotas[posicion]/numVotes[posicion];


        //Campuramos el ImageView
        ImageView imageView = (ImageView) findViewById(R.id.showImage);
        TextView noteShow = (TextView) findViewById(R.id.gradeToShow);

        //coloreamos las estrellas de la nota
        Button star1 = (Button) findViewById(R.id.star1);
        star1.setBackgroundResource(R.drawable.star);

        Button star2 = (Button) findViewById(R.id.star2);
        star2.setBackgroundResource(R.drawable.stare);

        Button star3 = (Button) findViewById(R.id.star3);
        star3.setBackgroundResource(R.drawable.stare);

        Button star4 = (Button) findViewById(R.id.star4);
        star4.setBackgroundResource(R.drawable.stare);

        Button star5 = (Button) findViewById(R.id.star5);
        star5.setBackgroundResource(R.drawable.stare);


        //genero tro random
        posicion = generateRandom(9);
        //Volcamos el drawable aleatorio a el imageView
        imageView.setImageResource(ListFotos[posicion]);
        String notaAMostrar = String.valueOf(notas[posicion]);

        noteShow.setText("Esta imagen tiene de nota: " + notas[posicion]);

    }

    public void setGrade2(View v){
        //añadimos a la nota maxima
        maxNotas[posicion] = maxNotas[posicion] + 2;

        //sumamos uno a el conteo
        numVotes[posicion]++;
        notas[posicion] = maxNotas[posicion]/numVotes[posicion];


        //Campuramos el ImageView
        ImageView imageView = (ImageView) findViewById(R.id.showImage);
        TextView noteShow = (TextView) findViewById(R.id.gradeToShow);


        //coloreamos las estrellas de la nota
        Button star1 = (Button) findViewById(R.id.star1);
        star1.setBackgroundResource(R.drawable.star);

        Button star2 = (Button) findViewById(R.id.star2);
        star2.setBackgroundResource(R.drawable.star);

        Button star3 = (Button) findViewById(R.id.star3);
        star3.setBackgroundResource(R.drawable.stare);

        Button star4 = (Button) findViewById(R.id.star4);
        star4.setBackgroundResource(R.drawable.stare);

        Button star5 = (Button) findViewById(R.id.star5);
        star5.setBackgroundResource(R.drawable.stare);


        //genero tro random
        posicion = generateRandom(9);
        //Volcamos el drawable aleatorio a el imageView
        imageView.setImageResource(ListFotos[posicion]);
        String notaAMostrar = String.valueOf(notas[posicion]);

        noteShow.setText("Esta imagen tiene de nota: "+notas[posicion]);

    }

    public void setGrade3(View v){
        //añadimos a la nota maxima
        maxNotas[posicion] = maxNotas[posicion] + 3;

        //sumamos uno a el conteo
        numVotes[posicion]++;
        notas[posicion] = maxNotas[posicion]/numVotes[posicion];


        //Campuramos el ImageView
        ImageView imageView = (ImageView) findViewById(R.id.showImage);
        TextView noteShow = (TextView) findViewById(R.id.gradeToShow);



        //coloreamos las estrellas de la nota
        Button star1 = (Button) findViewById(R.id.star1);
        star1.setBackgroundResource(R.drawable.star);

        Button star2 = (Button) findViewById(R.id.star2);
        star2.setBackgroundResource(R.drawable.star);

        Button star3 = (Button) findViewById(R.id.star3);
        star3.setBackgroundResource(R.drawable.star);

        Button star4 = (Button) findViewById(R.id.star4);
        star4.setBackgroundResource(R.drawable.stare);

        Button star5 = (Button) findViewById(R.id.star5);
        star5.setBackgroundResource(R.drawable.stare);


        //genero tro random
        posicion = generateRandom(9);
        //Volcamos el drawable aleatorio a el imageView
        imageView.setImageResource(ListFotos[posicion]);
        String notaAMostrar = String.valueOf(notas[posicion]);

        noteShow.setText("Esta imagen tiene de nota: "+notas[posicion]);
    }

    public void setGrade4(View v){
        //añadimos a la nota maxima
        maxNotas[posicion] = maxNotas[posicion] + 4;

        //sumamos uno a el conteo
        numVotes[posicion]++;
        notas[posicion] = maxNotas[posicion]/numVotes[posicion];


        //Campuramos el ImageView
        ImageView imageView = (ImageView) findViewById(R.id.showImage);
        TextView noteShow = (TextView) findViewById(R.id.gradeToShow);



        //coloreamos las estrellas de la nota
        Button star1 = (Button) findViewById(R.id.star1);
        star1.setBackgroundResource(R.drawable.star);

        Button star2 = (Button) findViewById(R.id.star2);
        star2.setBackgroundResource(R.drawable.star);

        Button star3 = (Button) findViewById(R.id.star3);
        star3.setBackgroundResource(R.drawable.star);

        Button star4 = (Button) findViewById(R.id.star4);
        star4.setBackgroundResource(R.drawable.star);

        Button star5 = (Button) findViewById(R.id.star5);
        star5.setBackgroundResource(R.drawable.stare);


        //genero tro random
        posicion = generateRandom(9);
        //Volcamos el drawable aleatorio a el imageView
        imageView.setImageResource(ListFotos[posicion]);
        String notaAMostrar = String.valueOf(notas[posicion]);

        noteShow.setText("Esta imagen tiene de nota: "+notas[posicion]);
    }

    public void setGrade5(View v){
        //añadimos a la nota maxima
        maxNotas[posicion] = maxNotas[posicion] + 5;

        //sumamos uno a el conteo
        numVotes[posicion]++;
        notas[posicion] = maxNotas[posicion]/numVotes[posicion];


        //Campuramos el ImageView
        ImageView imageView = (ImageView) findViewById(R.id.showImage);
        TextView noteShow = (TextView) findViewById(R.id.gradeToShow);


        //coloreamos las estrellas de la nota
        Button star1 = (Button) findViewById(R.id.star1);
        star1.setBackgroundResource(R.drawable.star);

        Button star2 = (Button) findViewById(R.id.star2);
        star2.setBackgroundResource(R.drawable.star);

        Button star3 = (Button) findViewById(R.id.star3);
        star3.setBackgroundResource(R.drawable.star);

        Button star4 = (Button) findViewById(R.id.star4);
        star4.setBackgroundResource(R.drawable.star);

        Button star5 = (Button) findViewById(R.id.star5);
        star5.setBackgroundResource(R.drawable.star);



        //genero tro random
        posicion = generateRandom(9);
        //Volcamos el drawable aleatorio a el imageView
        imageView.setImageResource(ListFotos[posicion]);
        String notaAMostrar = String.valueOf(notas[posicion]);

        noteShow.setText("Esta imagen tiene de nota: "+notas[posicion]);


    }

    public int generateRandom(int numMax){
        return ((int) (Math.random()*numMax)+1);
    }
}
