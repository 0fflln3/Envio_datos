package com.mc2.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declarar variables para los EditText
    // ET1 EditText nombre
    // ET2 EditText contraseña
    private EditText ET1;
    private EditText ET2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        // asignación de EditText a variables en el código
        ET1 = (EditText) findViewById(R.id.ET1); // nombre
        ET2 = (EditText) findViewById(R.id.ET2); // contraseña
    }

    // Método llamado al presionar el botón "Enviar"
    public void enviar(View view) {
        // Crear un Intent para navegar de MainActivity a MainActivity2
        Intent i = new Intent(this, MainActivity2.class);

        // Añadir el contenido del campo de nombre al Intent bajo la clave "dato_nombre"
        i.putExtra("dato_nombre", ET1.getText().toString());

        // Añadir el contenido del campo de contraseña al Intent bajo la clave "dato_contraseña"
        i.putExtra("dato_contraseña", ET2.getText().toString());

        // Iniciar la nueva Activity (MainActivity2) con los datos añadidos
        startActivity(i);
    }
}