package com.example.lucas.personaldata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
    }

    public void onClickSend(View v){

        TextView result = (TextView) findViewById(R.id.result);
        EditText nameText = (EditText) findViewById(R.id.name);
        Spinner ageSpin = (Spinner) findViewById(R.id.age);
        CheckBox studentBox = (CheckBox) findViewById(R.id.student);
        RadioButton womanRadio = (RadioButton) findViewById(R.id.woman);
        RadioButton manRadio = (RadioButton) findViewById(R.id.man);
        RadioGroup sexGroup = (RadioGroup) findViewById(R.id.sexGroup);


        String student;
        if(studentBox.isChecked()){
            student = "you are student ";
        }else{
            student = "you are not student ";
    }

        String sex;
        if (womanRadio.isChecked() || manRadio.isChecked()){
            if (womanRadio.isChecked()){
                sex = "a woman.";
            }
            else {
                sex = "a man";
            }
        }
        else {
            sex = "an alien";
        }


    result.setText("Your name is " + nameText.getText() + ", you are " + ageSpin.getSelectedItem() + " years old, " + student + "and you are " + sex);
}

    public  void onClickErase(View v){

        TextView result = (TextView) findViewById(R.id.result);
        EditText nameText = (EditText) findViewById(R.id.name);
        Spinner ageSpin = (Spinner) findViewById(R.id.age);
        CheckBox studentBox = (CheckBox) findViewById(R.id.student);
        RadioGroup sexGroup = (RadioGroup) findViewById(R.id.sexGroup);

        result.setText("");
        nameText.setText("");
        ageSpin.setSelection(2);
        studentBox.setChecked(false);
        sexGroup.clearCheck();
    }
}
