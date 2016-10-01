package com.example.lucas.addsubtract;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*METODOS PARA DOS BOTONES*/

    /*public void clickAdd(View v){
        Button add = (Button) findViewById(R.id.add);
        TextView resulttv = ((TextView) findViewById(R.id.result));

        EditText first = (EditText) findViewById(R.id.first);
        EditText second = (EditText) findViewById(R.id.second);

        String value1 = first.getText().toString();
        String value2 = second.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int result = num1+num2;
        String result2 = String.valueOf(result);
        resulttv.setText("result: " + result2);
    }

    public void clickSubtract(View v){
        Button subtract = (Button) findViewById(R.id.subtract);
        TextView resulttv = ((TextView) findViewById(R.id.result));

        EditText first = (EditText) findViewById(R.id.first);
        EditText second = (EditText) findViewById(R.id.second);

        String value1 = first.getText().toString();
        String value2 = second.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);

        int result = num1-num2;
        String result2 = String.valueOf(result);
        resulttv.setText("result: " + result2);
    }*/

    /*METODO PARA EL RADIOBUTTON*/

     /*public void clickCalculate (View v){

        RadioGroup radioG = (RadioGroup) findViewById(R.id.radioG);
        int check = radioG.getCheckedRadioButtonId();

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton subtract = (RadioButton) findViewById(R.id.subtract);

        if(add.isChecked()){
            TextView resulttv = ((TextView) findViewById(R.id.result));

            EditText first = (EditText) findViewById(R.id.first);
            EditText second = (EditText) findViewById(R.id.second);

            String value1 = first.getText().toString();
            String value2 = second.getText().toString();

            int num1 = Integer.parseInt(value1);
            int num2 = Integer.parseInt(value2);

            int result = num1+num2;
            String result2 = String.valueOf(result);
            resulttv.setText("result: " + result2);
        }
        else{
            if(subtract.isChecked()){
                TextView resulttv = ((TextView) findViewById(R.id.result));

                EditText first = (EditText) findViewById(R.id.first);
                EditText second = (EditText) findViewById(R.id.second);

                String value1 = first.getText().toString();
                String value2 = second.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);

                int result = num1-num2;
                String result2 = String.valueOf(result);
                resulttv.setText("result: " + result2);
            }
        }

    }*/

    /*METODO PARA EL SPINNER*/

    public void clickCalculate(View v){
        TextView tv = (TextView)findViewById(R.id.result);
        Spinner spin = (Spinner)findViewById(R.id.spin);

        String calculate = String.valueOf((spin.getSelectedItem()));

        EditText first = (EditText) findViewById(R.id.first);
        EditText second = (EditText) findViewById(R.id.second);

        String value1 = first.getText().toString();
        String value2 = second.getText().toString();

        double num1 = Integer.parseInt(value1);
        double num2 = Integer.parseInt(value2);

        if (calculate.equals ("Add")){
            double result = num1 + num2;
            String fresult = "Result: " + String.valueOf(result);
            tv.setText(fresult);
        }

        if (calculate.equals ("Subtract")){
            double result = num1 - num2;
            String fresult = "Result: " + String.valueOf(result);
            tv.setText(fresult);
        }

        if (calculate.equals ("Multiply")){
            double result = num1 * num2;
            String fresult = "Result: " + String.valueOf(result);
            tv.setText(fresult);
        }

        if (calculate.equals ("Divide")){
            double result = num1 / num2;
            String fresult = "Result: " + String.valueOf(result);
            tv.setText(fresult);
        }

    }

}
