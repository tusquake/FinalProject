package com.example.finalproject.Level1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.finalproject.R;

public class Level1_EvsGames_Menu extends AppCompatActivity {

    Button game1,game2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_evs_games_menu);

        game1 = findViewById(R.id.game1);
        game2 = findViewById(R.id.game2);


        game1.setOnClickListener(view -> {
            Intent intent = new Intent(Level1_EvsGames_Menu.this,MatchGame.class);
            startActivity(intent);
            onBackPressed();
        });

        game2.setOnClickListener(view -> {
//            Intent intent = new Intent(Level1_NumeracyGames_Menu.this, );
//            startActivity(intent);
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });


    }
}