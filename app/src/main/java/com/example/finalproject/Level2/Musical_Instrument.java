package com.example.finalproject.Level2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.finalproject.R;

public class Musical_Instrument extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_instrument);

        mediaPlayer = new MediaPlayer();


        ImageView questionImageView1 = findViewById(R.id.questionImageView1);
        ImageView questionImageView2 = findViewById(R.id.questionImageView2);
        ImageView questionImageView3 = findViewById(R.id.questionImageView3);
        ImageView questionImageView4 = findViewById(R.id.questionImageView4);

        questionImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(R.raw.correct_answer);
            }
        });


        questionImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(R.raw.correct_answer);
            }
        });

        questionImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(R.raw.correct_answer);
            }
        });

        questionImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMusic(R.raw.correct_answer);
            }
        });







    }


    private void playMusic(int musicResource) {
        try {
            // If MediaPlayer is playing, stop it
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
            }

            // Set data source and prepare MediaPlayer
            mediaPlayer = MediaPlayer.create(this, musicResource);

            // Start playing the music
            mediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        // Release MediaPlayer resources
//        if (mediaPlayer != null) {
//            mediaPlayer.release();
//        }
//    }
}