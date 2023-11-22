package com.example.finalproject.Level1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.airbnb.lottie.LottieAnimationView;
import com.example.finalproject.R;

public class Animation_done extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_done);


        LottieAnimationView anim = findViewById(R.id.anim3);
        anim.setAnimation(R.raw.well_done);
        anim.playAnimation();


        // Inside your activity or fragment

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                onBackPressed(); // This navigates back after 4 seconds
            }
        }, 4000); // 4000 milliseconds = 4 seconds



    }
}