package tk.lucassalinas.tanglebrain;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class Grid_levels extends AppCompatActivity {

    //private TextView prueba;

    private MediaPlayer player1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_levels);

        player1 = MediaPlayer.create(Grid_levels.this, R.raw.next);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        //Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        soundNext();
                        startActivity(new Intent(Grid_levels.this, Level1.class));
                        Grid_levels.this.finish();
                        break;

                    case 1:
                        soundNext();
                        startActivity(new Intent(Grid_levels.this, Level2.class));
                        Grid_levels.this.finish();
                        break;

                    case 2:
                        soundNext();
                        startActivity(new Intent(Grid_levels.this, Level3.class));
                        Grid_levels.this.finish();
                        break;

                    case 3:
                        soundNext();
                        startActivity(new Intent(Grid_levels.this, Level4.class));
                        Grid_levels.this.finish();
                        break;

                    case 4:
                        soundNext();
                        startActivity(new Intent(Grid_levels.this, Level5.class));
                        Grid_levels.this.finish();
                        break;

                    case 5:
                        soundNext();
                        startActivity(new Intent(Grid_levels.this, Level6.class));
                        Grid_levels.this.finish();
                        break;
                }
                overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
            }
        });
    }

    public void clickHall(View v) {
        startActivity(new Intent(Grid_levels.this, HallOfFame.class));
    }

    public void soundNext() {
        player1.seekTo(0);
        player1.start();
    }

    @Override
    public void onBackPressed() {
        Grid_levels.this.finish();
        Toast t1 = Toast.makeText(getApplicationContext(), "Good bye!", Toast.LENGTH_SHORT);
        t1.setGravity(Gravity.CENTER, 0, 0);
        t1.show();
    }

    /////////////////// Menu /////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        //Respond to menu item selected
        switch (item.getItemId()) {
            case R.id.instructions:
                Toast t1 = Toast.makeText(getApplicationContext(), "instructions", Toast.LENGTH_LONG);

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.instructions, null);

                t1.setView(layout);
                t1.setGravity(Gravity.CENTER, 0, 0);
                t1.show();
                break;
            case R.id.about:
                startActivity(new Intent(Grid_levels.this, about.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
