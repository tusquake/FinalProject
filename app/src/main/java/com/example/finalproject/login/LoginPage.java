package com.example.finalproject.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.Menu.MenuActivity;
import com.example.finalproject.R;

public class LoginPage extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(view -> {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            if (username.equals("sanjeeban") && password.equals("dummy")) {
                // Valid credentials, navigate to MenuActivity
                Intent intent = new Intent(LoginPage.this, MenuActivity.class);
                startActivity(intent);
            } else {
                // Invalid credentials, show toast message
                Toast.makeText(LoginPage.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });


    }
}