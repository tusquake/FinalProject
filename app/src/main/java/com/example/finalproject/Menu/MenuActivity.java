package com.example.finalproject.Menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.finalproject.Level1.MatchGame;
import com.example.finalproject.Level1.Menu_Level1;
import com.example.finalproject.Level2.Animal_Quiz;
import com.example.finalproject.Level2.Menu_Level2;
import com.example.finalproject.Level3.Menu_Level3;
import com.example.finalproject.R;
import com.example.finalproject.login.LoginPage;

public class MenuActivity extends AppCompatActivity {

    Button level1_button,level2_button,level3_button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LottieAnimationView animationView = findViewById(R.id.anim2);
        animationView.setAnimation(R.raw.welcome_anim);
        animationView.playAnimation();

        level1_button = findViewById(R.id.level1);
        level2_button = findViewById(R.id.level2);
        level3_button = findViewById(R.id.level3);

        level1_button.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, Menu_Level1.class);
            startActivity(intent);
        });

        level2_button.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, Menu_Level2.class);
            startActivity(intent);
        });

        level3_button.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, Menu_Level3.class);
            startActivity(intent);
        });

        Button exitApp = findViewById(R.id.exitApp);
        exitApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitApplication(); // This will close the current activity and exit the app
            }
        });


    }

    private void exitApplication() {
        finishAffinity(); // This will close all activities and exit the app
    }
}