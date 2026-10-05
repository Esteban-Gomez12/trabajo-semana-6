package com.example.semana6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BTAceptar = findViewById(R.id.BTAceptar);
        EditText ETNombreFoto = findViewById(R.id.ETNombreFoto);

        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoIngresado = ETNombreFoto.getText().toString();

                // ID de la imagen almacenada en res/drawable
                int imagenId = R.drawable.ic_launcher_background;

                Intent intent = new Intent(MainActivity.this, AResultado.class);

                // Empacando datos mediante Clave-Valor
                intent.putExtra("CLAVE_TEXTO", textoIngresado);
                intent.putExtra("CLAVE_IMAGEN", imagenId);

                startActivity(intent);
            }
        });
    }
}