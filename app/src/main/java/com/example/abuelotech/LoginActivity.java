package com.example.abuelotech;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asegúrate de que tu diseño se llame activity_main.xml

        // Configurar WindowInsets para ajustar los márgenes o el relleno
        View rootView = findViewById(R.id.main); // ID raíz del diseño XML
        ViewCompat.setOnApplyWindowInsetsListener(rootView, (v, insets) -> {
            // Obtener los Insets específicos de las barras de sistema
            int left = insets.getInsets(Type.systemBars()).left;
            int top = insets.getInsets(Type.systemBars()).top;
            int right = insets.getInsets(Type.systemBars()).right;
            int bottom = insets.getInsets(Type.systemBars()).bottom;

            // Aplicar relleno basado en los Insets
            v.setPadding(left, top, right, bottom);

            return insets;
        });
    }
}
