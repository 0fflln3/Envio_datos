package com.mc2.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    // Declarar una variable para el TextView
    // TV3 TextView mensaje de bienvenida
    private TextView TV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // Enlazar el TextView del layout a la variable TV3
        TV3 = (TextView) findViewById(R.id.TV3);

        // Recibir los datos enviados desde MainActivity
        String dato1 = getIntent().getStringExtra("dato_nombre"); // Nombre ingresado por el usuario
        String dato2 = getIntent().getStringExtra("dato_contraseña"); // Contraseña ingresada

        // Verificar si el campo del nombre está vacío
        if (dato1.isEmpty()) {
            Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show(); // Mostrar mensaje de error
            finish(); // Cierra esta Activity y regresa a MainActivity
        }

        // Verificar si el nombre contiene números
        if (dato1.matches(".*\\d.*")) {
            Toast.makeText(this, "El nombre no debe contener números", Toast.LENGTH_SHORT).show(); // Mostrar error
            finish(); // Cierra esta Activity y regresa a MainActivity
        }

        // Verificar si el campo de la contraseña está vacío
        if (dato2.isEmpty()) {
            Toast.makeText(this, "Ingrese la contraseña", Toast.LENGTH_SHORT).show(); // Mostrar mensaje de error
            finish(); // Cierra esta Activity y regresa a MainActivity
        }

        // Verificar si la contraseña es correcta
        if ("1234".equals(dato2)) {
            // Si la contraseña es correcta, mostrar el mensaje de bienvenida con el nombre del usuario
            TV3.setText("Hola " + dato1 + ", has accedido con éxito");
        } else {
            // Si la contraseña es incorrecta, mostrar un mensaje de error
            Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show(); // Mostrar mensaje
            finish(); // Cierra esta Activity y regresa a MainActivity
        }
    }

    // Método para regresar a MainActivity al hacer clic en un botón
    public void regresar(View view) {
        finish(); // Cierra esta Activity y regresa a la anterior
    }
}