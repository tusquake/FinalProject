package com.example.finalproject.Level1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.finalproject.R;

public class Menu_Level1 extends AppCompatActivity {


    Button gotoNumeracy,gotoLiteracy,gotoEvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_level1);


        gotoLiteracy = findViewById(R.id.literacy);
        gotoNumeracy = findViewById(R.id.numeracy);
        gotoEvs = findViewById(R.id.evs);

        gotoLiteracy.setOnClickListener(view -> {
            Intent intent = new Intent(Menu_Level1.this,Level1_LiteracyGames_Menu.class);
            startActivity(intent);
            //onBackPressed();
        });

        gotoNumeracy.setOnClickListener(view -> {
            Intent intent = new Intent(Menu_Level1.this,Level1_NumeracyGames_Menu.class);
            startActivity(intent);
            //onBackPressed();
        });

        gotoEvs.setOnClickListener(view -> {
            Intent intent = new Intent(Menu_Level1.this,Level1_EvsGames_Menu.class);
            startActivity(intent);
            onBackPressed();
        });




    }
}