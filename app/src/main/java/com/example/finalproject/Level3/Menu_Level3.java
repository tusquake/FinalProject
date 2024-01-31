package com.example.finalproject.Level3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.finalproject.Level1.Level1_EvsGames_Menu;
import com.example.finalproject.Level1.Level1_LiteracyGames_Menu;
import com.example.finalproject.Level1.Level1_NumeracyGames_Menu;
import com.example.finalproject.Level1.Menu_Level1;
import com.example.finalproject.R;

public class Menu_Level3 extends AppCompatActivity {

    Button gotoNumeracy,gotoLiteracy,gotoEvs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_level3);

        gotoLiteracy = findViewById(R.id.literacy);
        gotoNumeracy = findViewById(R.id.numeracy);
        gotoEvs = findViewById(R.id.evs);

        gotoLiteracy.setOnClickListener(view -> {
//            Intent intent = new Intent(Menu_Level1.this, Level1_LiteracyGames_Menu.class);
//            startActivity(intent);
//            //onBackPressed();
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });

        gotoNumeracy.setOnClickListener(view -> {
//            Intent intent = new Intent(Menu_Level1.this, Level1_NumeracyGames_Menu.class);
//            startActivity(intent);
//            //onBackPressed();
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });

        gotoEvs.setOnClickListener(view -> {
//            Intent intent = new Intent(Menu_Level1.this, Level1_EvsGames_Menu.class);
//            startActivity(intent);
//            onBackPressed();
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });
    }
}