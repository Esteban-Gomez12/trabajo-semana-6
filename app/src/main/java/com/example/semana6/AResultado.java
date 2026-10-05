package com.example.semana6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_resultado);

        TextView tvResultado = findViewById(R.id.tvResultado);
        ImageView imgResultado = findViewById(R.id.imgResultado);

        Intent intent = getIntent();
        if (intent != null) {
            // Desempacando los valores
            String textoRecibido = intent.getStringExtra("CLAVE_TEXTO");
            int imagenRecibida = intent.getIntExtra("CLAVE_IMAGEN", 0);

            // Asignando los valores recibidos a los elementos de la interfaz
            tvResultado.setText(textoRecibido);

            if (imagenRecibida != 0) {
                imgResultado.setImageResource(imagenRecibida);
            }
        }
    }
}