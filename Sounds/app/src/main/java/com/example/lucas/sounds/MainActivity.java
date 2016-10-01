package com.example.lucas.sounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player1;
    MediaPlayer player2;
    MediaPlayer player3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = MediaPlayer.create(MainActivity.this, R.raw.trollolol);
        player2 = MediaPlayer.create(MainActivity.this, R.raw.sexysax);
        player3 = MediaPlayer.create(MainActivity.this, R.raw.rickroll);
    }

    public  void  firstSound(View v) {
        player1.seekTo(0);
        player1.start();
        if(player2.isPlaying() || player3.isPlaying()) {
            player2.pause();
            player3.pause();
        }
    }

    public  void  secondSound(View v) {
        player2.seekTo(0);
        player2.start();
        if(player1.isPlaying() || player3.isPlaying()) {
            player1.pause();
            player3.pause();
        }
    }

    public  void  thirthSound(View v) {
        player3.seekTo(0);
        player3.start();
        if(player1.isPlaying() || player2.isPlaying()) {
            player1.pause();
            player2.pause();
        }
    }
}
