package com.example.alphahacks21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MediaPlayer backgroundSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiates the backgrounds music and the splash screen for the app
        backgroundSong = MediaPlayer.create(this, R.raw.background);
        backgroundSong.start();
    }

    //transitions to the FlackPicker activity
    public void nextPage(View view){
        Intent intent = new Intent(this, FlavorPicker.class);
        startActivity(intent);
    }


}