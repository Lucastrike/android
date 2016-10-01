package tk.lucassalinas.tanglebrain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HallOfFame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall_of_fame);

        String puntuacionTotal = "";

        ///////////////// DATABASE ///////////////////
        MySQLiteHelper db = new MySQLiteHelper(this);

        //db.addScore(new Score(myFollowers.getFollowersLvl1()));

        TextView muestra = (TextView) findViewById(R.id.hall);

        if(db.getScore(1).getScore() > 0){
            puntuacionTotal += "Max. Level "+ db.getScore(1).getId()+": "+db.getScore(1).getScore();
            if(db.getScore(2).getScore() > 0){
                puntuacionTotal += "\nMax. Level "+ db.getScore(2).getId()+": "+db.getScore(2).getScore();
                if(db.getScore(3).getScore() > 0){
                    puntuacionTotal += "\nMax. Level "+ db.getScore(3).getId()+": "+db.getScore(3).getScore();
                    if(db.getScore(4).getScore() > 0){
                        puntuacionTotal += "\nMax. Level "+ db.getScore(4).getId()+": "+db.getScore(4).getScore();
                        if(db.getScore(5).getScore() > 0){
                            puntuacionTotal += "\nMax. Level "+ db.getScore(5).getId()+": "+db.getScore(5).getScore();
                            if(db.getScore(6).getScore() > 0){
                                puntuacionTotal += "\nMax. Level "+ db.getScore(6).getId()+": "+db.getScore(6).getScore();
                            }
                        }
                    }
                }

            }
        }
        muestra.setText(puntuacionTotal);
    }
}
