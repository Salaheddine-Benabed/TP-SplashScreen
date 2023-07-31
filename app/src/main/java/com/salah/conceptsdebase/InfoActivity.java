package com.salah.conceptsdebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    TextView username, password;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        username = findViewById(R.id.nom_utilisateur);
        password = findViewById(R.id.mot_de_passe);

        Intent i = getIntent();
        username.setText("Nom d'utilisateur: "+i.getStringExtra("username"));
        password.setText("Mot de passe: "+i.getStringExtra("password"));
    }
}