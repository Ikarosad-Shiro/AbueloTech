package com.example.abuelotech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText etUser = findViewById(R.id.etLoginUser);
        TextInputEditText etPassword = findViewById(R.id.etLoginPassword);
        MaterialButton btnLogin = findViewById(R.id.btnLogin);
        TextView tvToRegister = findViewById(R.id.tvToRegister);

        btnLogin.setOnClickListener(v -> {
            String user = etUser.getText().toString();
            String password = etPassword.getText().toString();

            if (user.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Iniciando sesión...", Toast.LENGTH_SHORT).show();
                // Aquí puedes manejar la lógica del login
            }
        });

        tvToRegister.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}