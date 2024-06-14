package com.example.examena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    //Declaración de variables (EditText y Botón Next)
    private EditText editTextNumber;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Método onCreate que inicializa la actividad
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Establece el XML como la interfaz de usuario de la actividad

        editTextNumber = findViewById(R.id.editTextNumber); //inicializa las variables
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() { //Se ejecuta este código cuando se presiona el botón Next
            @Override
            public void onClick(View v) {
                int inputNumber = Integer.parseInt(editTextNumber.getText().toString());
                Intent intent = new Intent(MainActivity.this, MatrizActivity.class); //El botón inicia el método MatrizActivity
                intent.putExtra("inputNumber", inputNumber);
                startActivity(intent); //Inicia el método MatrizActivity
            }
        });
    }
}