package com.example.examena;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MatrizActivity extends AppCompatActivity {

    //Se referencia el RecyclerView y el botón Back
    private RecyclerView recyclerView;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inicializa la actividad
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriz); //Establece el archivo de diseño XML como la interfaz de usuario de esta actividad

        Button btnBack = findViewById(R.id.btnBack); //Inicia la variable a través del botón Back
        btnBack.setOnClickListener(new View.OnClickListener() { //El bloque de código dentro de onClick se ejecuta cuando se presiona el botón
            @Override
            public void onClick(View v) {
                onBackPressed(); //Se devuelve a la actividad anterior
            }
        });

        recyclerView = findViewById(R.id.recy); //Inicializa el RecyclerView del XML

        int inputNumber = getIntent().getIntExtra("inputNumber", 0); //Obtiene el número de entrada pasado desde la MainActivity usando el 'Intent'
        int maxPerfectSquare = getMaxPerfectSquare(inputNumber); // Llama al método getMaxPerfectSquare para obtener el cuadrado perfecto más grande menor o igual al input que se programa más abajo
        int gridSize = (int) Math.sqrt(maxPerfectSquare); //Calcula la raíz cuadrada de maxPerfectSquare para determinar el tamaño de la cuadrícula y por tanto el número de filas y columnas

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridSize)); //Establece un GridLayoutManager en el RecyclerView con el tamaño de la cuadrícula calculado
        MatrizAdapter adapter = new MatrizAdapter(maxPerfectSquare);
        recyclerView.setAdapter(adapter); //Establece el adaptador en el RecyclerView, lo que permite que los datos se muestren en la cuadrícula
    }

    private int getMaxPerfectSquare(int number) { //Encuentra el mayor cuadrado perfecto menor o igual al número de entrada
        int i = 0;
        while (i * i <= number) {
            i++;
        }
        i--;
        return i * i;
    }
}