package es.com.lucassalinas.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);
        image.setBackgroundResource(R.drawable.trump1);
        flag = true;

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    image.setBackgroundResource(R.drawable.trump2);
                    flag = false;
                }
                else {
                    image.setBackgroundResource(R.drawable.trump1);
                    flag = true;
                }
            }
        });

    }
}
