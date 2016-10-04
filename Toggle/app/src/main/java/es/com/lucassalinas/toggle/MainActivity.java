package es.com.lucassalinas.toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton togglebtn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        togglebtn = (ToggleButton) findViewById(R.id.togglebtn);
        togglebtn.setBackgroundResource(R.drawable.homer2);

        togglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (togglebtn.isChecked()){
                    togglebtn.setBackgroundResource(R.drawable.homer1);
                    text.setText("Has pulsado el boton1: ON");
                } else {
                    togglebtn.setBackgroundResource(R.drawable.homer2);
                    text.setText("Has pulsado el boton1: OFF");
                }
            }
        });

    }
}
