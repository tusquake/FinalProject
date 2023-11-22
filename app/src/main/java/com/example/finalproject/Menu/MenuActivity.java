package com.example.finalproject.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.finalproject.Level1.MatchGame;
import com.example.finalproject.Level2.Animal_Quiz;
import com.example.finalproject.R;
import com.example.finalproject.login.LoginPage;

public class MenuActivity extends AppCompatActivity {

    Button level1_button,level2_button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LottieAnimationView animationView = findViewById(R.id.anim2);
        animationView.setAnimation(R.raw.welcome_anim);
        animationView.playAnimation();

        level1_button = findViewById(R.id.level1);
        level2_button = findViewById(R.id.level2);

        level1_button.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, MatchGame.class);
            startActivity(intent);
        });

        level2_button.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, Animal_Quiz.class);
            startActivity(intent);
        });








    }
}