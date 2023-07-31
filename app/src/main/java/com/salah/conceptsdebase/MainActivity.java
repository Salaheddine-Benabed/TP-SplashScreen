package com.salah.conceptsdebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etUsername, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_button);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_pass);
        btnLogin.setOnClickListener(v -> {
            String username  = etUsername.getText().toString();
            String password  = etPassword.getText().toString();

            Intent i = new Intent(MainActivity.this, InfoActivity.class);
            i.putExtra("username", username);
            i.putExtra("password", password);
            startActivity(i);
            finish();
        });
    }
}