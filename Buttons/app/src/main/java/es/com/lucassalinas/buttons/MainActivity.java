package es.com.lucassalinas.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button button1;
    Button button2;
    ImageButton button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button1:
                        text.setText("You pressed button 1: button");
                        break;
                    case R.id.button2:
                        text.setText("You pressed button 2: OFF");
                        break;
                    case R.id.button3:
                        text.setText("You pressed button 3: Check");
                        break;
                    case R.id.button4:
                        text.setText("You pressed button 4: ON");
                        break;
                    case R.id.button5:
                        text.setText("You pressed button 5: Check button");
                        break;
                }
            }
        };
        button1.setOnClickListener(listen);
        button2.setOnClickListener(listen);
        button3.setOnClickListener(listen);
        button4.setOnClickListener(listen);
        button5.setOnClickListener(listen);

    }
}
