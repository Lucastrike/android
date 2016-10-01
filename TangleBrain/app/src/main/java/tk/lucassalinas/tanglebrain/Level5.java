package tk.lucassalinas.tanglebrain;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.logging.Level;

public class Level5 extends AppCompatActivity {

    // OPTIONS ARRAY
    private String[] name = new String[]{"Facebook", "Twitter", "Youtube", "Skype", "Buzz", "Tumblr", "Vimeo", "MySpace"};
    private int position;

    // SHOWS THE POSITION VALUE
    private TextView textName;

    // SOCIAL BUTTONS
    private Button facebook;
    private Button twitter;
    private Button youtube;
    private Button skype;
    private Button buzz;
    private Button tumblr;
    private Button vimeo;
    private Button myspace;

    // COUNTDOWN TIMER
    private TextView timer;

    private TextView follow;

    // RESTART BUTTON
    private Button restart;

    // LEVEL INIT
    private Button go;
    private TextView intro;

    // MENU BUTTON
    private TextView menu;

    // FINISH BACKGROUND
    private TextView finish;

    // SOUNDS WIN/FAIL/BONUS/NEW_LEVEL
    private MediaPlayer player1;
    private MediaPlayer player2;
    private MediaPlayer player3;
    private MediaPlayer player4;

    // COUNT BONUS VARIABLES
    private int countBonus = 0;
    private boolean activatedBonus = false;

    // DDBB
    private MySQLiteHelper db;
    private int myScoreLvl5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        position = generateRandom();
        textName = (TextView) findViewById(R.id.textnombre);
        //valor = String.valueOf(name[position]);
        textName.setText(name[position]);

        ///////////////// BUTTONS /////////////////
        facebook = (Button) findViewById(R.id.facebook);
        twitter = (Button) findViewById(R.id.twitter);
        youtube = (Button) findViewById(R.id.youtube);
        skype = (Button) findViewById(R.id.skype);
        buzz = (Button) findViewById(R.id.buzz);
        tumblr = (Button) findViewById(R.id.tumblr);
        vimeo = (Button) findViewById(R.id.vimeo);
        myspace = (Button) findViewById(R.id.myspace);
        facebook.setClickable(false);
        twitter.setClickable(false);
        youtube.setClickable(false);
        skype.setClickable(false);
        buzz.setClickable(false);
        tumblr.setClickable(false);
        vimeo.setClickable(false);
        myspace.setClickable(false);
        /////////////////////////////////////////

        restart = (Button) findViewById(R.id.restart);
        restart.setClickable(false);

        follow = (TextView) findViewById(R.id.follow);

        go = (Button) findViewById(R.id.go);
        intro = (TextView) findViewById(R.id.intro);


        menu = (TextView) findViewById(R.id.menu);

        finish = (TextView) findViewById(R.id.finish);

        player1 = MediaPlayer.create(Level5.this, R.raw.up);
        player2 = MediaPlayer.create(Level5.this, R.raw.down);
        player3 = MediaPlayer.create(Level5.this, R.raw.bonus);
        player4 = MediaPlayer.create(Level5.this, R.raw.new_level);

        ///////////////// DATABASE ///////////////////
        db = new MySQLiteHelper(this);

        myScoreLvl5 = 0;
        ///////////////////////////////////////////////

    }

    ///////////////// RANDOM /////////////////
    public int generateRandom() {
        //Create an object of a random Class, that is an int, and the max value is the max. position + 1 (4)
        Random rnd = new Random();
        position = rnd.nextInt(8);
        return position;
    }
    //////////////////////////////////////////

    ///////////////// CHECK ANSWER /////////////////
    public void testing() {
        if (facebook.isPressed() && position == 0 || twitter.isPressed() && position == 1 || youtube.isPressed() && position == 2
                || skype.isPressed() && position == 3 || buzz.isPressed() && position == 4 || tumblr.isPressed() && position == 5
                || vimeo.isPressed() && position == 6 || myspace.isPressed() && position == 7)
            win();
        else  fail();
    }
    ///////////////////////////////////////////////

    ///////////////// WIN/FAIL /////////////////
    public void win(){
        if (activatedBonus == true){
            addFollowersBonus();
            finishBonus();
        }else {
            addFollowers();
            countBonus = countBonus + 1;
        }

        generateRandom();
        soundUp();
        //valor = String.valueOf(name[position]);
        textName.setText(name[position]);
    }

    public void fail(){
        countBonus = 0;
        subtractFollowers();
        generateRandom();
        soundDown();
        //valor = String.valueOf(name[position]);
        textName.setText(name[position]);
    }
    /////////////////////////////////////////////

    ///////////////// FINISH BONUS ///////////////////
    public void finishBonus(){
        CountDownTimer finishBonus = new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                activatedBonus = false;
            }
        };
        finishBonus.start();
    }
    //////////////////////////////////////////////////

    ///////////////// ADD/SUBTRACT LOCAL VARIABLE /////////////////
    public void addFollowers(){
        myScoreLvl5 += 10000;

        follow.setText(Integer.toString(myScoreLvl5));
        follow.setTextColor(Color.GREEN);
    }
    public void addFollowersBonus(){
        myScoreLvl5 += 20000;

        follow.setText(Integer.toString(myScoreLvl5));
        follow.setTextColor(Color.GREEN);
    }

    public void  subtractFollowers(){
        myScoreLvl5 -= 20000;

        follow.setText(Integer.toString(myScoreLvl5));
        follow.setTextColor(Color.RED);
    }
    ///////////////////////////////////////////////////////////////

    ///////////////// TIMER /////////////////
    public void timer(){
        //countdowntimer
        timer = (TextView) findViewById(R.id.timer);
        CountDownTimer count = new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer.setText("" + millisUntilFinished / 1000);

                //Orange --> 255, 165, 0
                //Dark orange --> 255, 140, 0
                //Orange red --> 255, 69, 0
                //Red --> 255, 0, 0

                if ((millisUntilFinished/1000) < 10 && (millisUntilFinished/1000) > 7){
                    timer.setTextColor(Color.rgb(255,165,0));
                } else if ((millisUntilFinished/1000) < 8 && (millisUntilFinished/1000) > 5){
                    timer.setTextColor(Color.rgb(255,140,0));
                } else if ((millisUntilFinished/1000) < 6 && (millisUntilFinished/1000) > 3){
                    timer.setTextColor(Color.rgb(255,69,0));
                } else if ((millisUntilFinished/1000) < 4){
                    timer.setTextColor(Color.rgb(255,0,0));
                }

                if (countBonus == 10){
                    toastBonus();
                }
            }

            public void onFinish() {
                timer.setText(R.string.timer);
                timer.setTextColor(Color.RED);

                facebook.setClickable(false);
                twitter.setClickable(false);
                youtube.setClickable(false);
                skype.setClickable(false);
                buzz.setClickable(false);
                tumblr.setClickable(false);
                vimeo.setClickable(false);
                myspace.setClickable(false);

                restart.setVisibility(View.VISIBLE);
                menu.setVisibility(View.VISIBLE);
                finish.setVisibility(View.VISIBLE);

                if (myScoreLvl5 >= db.getScore(5).getScore()) {
                    db.updateScore(new Score(5, myScoreLvl5));
                    //Log.d("upFollowers", Integer.toString(upFollowers));
                    //Log.d("myFollowers", myFollowers.getStringLvl1());
                }
            }
        };
        count.start();
    }

    public void toastBonus(){

        countBonus = 0;
        activatedBonus = true;

        soundBonus();
        Toast t1 = Toast.makeText(getApplicationContext(), "bonus", Toast.LENGTH_SHORT);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.bonusx2_toast, null);

        t1.setView(layout);
        t1.setGravity(Gravity.CENTER, 0, 0);
        t1.show();
    }
    ///////////////////////////////////////////////

    ///////////////// START LEVEL /////////////////
    public void clickGo(View v){
        go.setVisibility(View.INVISIBLE);
        intro.setVisibility(View.INVISIBLE);
        textName.setVisibility(View.VISIBLE);

        timer();

        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(v.getId() == facebook.getId()){
                    comprobacion();
                }*/
                if (restart.isPressed()){
                    restart();
                } else {
                    testing();
                }
            }
        };

        //Linking the buttons with the listener.
        facebook.setOnClickListener(listen);
        twitter.setOnClickListener(listen);
        youtube.setOnClickListener(listen);
        skype.setOnClickListener(listen);
        buzz.setOnClickListener(listen);
        tumblr.setOnClickListener(listen);
        vimeo.setOnClickListener(listen);
        myspace.setOnClickListener(listen);
        restart.setOnClickListener(listen);
    }
    ////////////////////////////////////////////////

    ///////////////// MENU /////////////////
    public void clickMenu(View v){
        startActivity(new Intent(Level5.this, Grid_levels.class));
        this.finish();

        //Log.d("ScoreDataBase", String.valueOf(db.getScore(1).getScore()));
        if (myScoreLvl5 >= 840000) {
            //Log.d("myScore", String.valueOf(myScoreLvl1));
            CountDownTimer count = new CountDownTimer(1000, 1000) {
                public void onTick(long millisUntilFinished) {
                }

                public void onFinish() {

                    soundNewLevel();
                    Toast t1 = Toast.makeText(getApplicationContext(), "congratulations", Toast.LENGTH_LONG);

                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.congrat_toast_level6, null);

                    t1.setView(layout);
                    t1.setGravity(Gravity.CENTER, 0, 0);
                    t1.show();
                }
            };
            count.start();
        }
    }
    ////////////////////////////////////////

    ///////////////// RESTART /////////////////
    public void restart(){
        startActivity(new Intent(this, Level5.class));
        myScoreLvl5 = 0;
        this.finish();
    }
    //////////////////////////////////////////

    ///////////////// SOUNDS /////////////////
    public void soundUp() {
        player1.seekTo(0);
        player1.start();
    }

    public void soundDown() {
        player2.seekTo(0);
        player2.start();
    }

    public void soundBonus(){
        player3.seekTo(0);
        player3.start();
    }

    public void soundNewLevel(){
        player4.seekTo(0);
        player4.start();
    }
    //////////////////////////////////////////

    ///////////////// ANDROID BACK BUTTON /////////////////
    @Override
    public void onBackPressed(){
        restart.setVisibility(View.VISIBLE);
        menu.setVisibility(View.VISIBLE);
        finish.setVisibility(View.VISIBLE);
    }
    ///////////////////////////////////////////////////////
}