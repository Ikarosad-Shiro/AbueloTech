package com.example.abuelotech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextInputEditText etUser = findViewById(R.id.etRegisterUser);
        TextInputEditText etPassword = findViewById(R.id.etRegisterPassword);
        MaterialButton btnRegister = findViewById(R.id.btnRegister);
        TextView tvToLogin = findViewById(R.id.tvToLogin);

        btnRegister.setOnClickListener(v -> {
            String user = etUser.getText().toString();
            String password = etPassword.getText().toString();

            if (user.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                // Aquí puedes manejar la lógica de registro
            }
        });

        tvToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }
}
