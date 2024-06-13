package com.example.examena;

import android.os.Bundle;
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

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriz);

        recyclerView = findViewById(R.id.recy);

        int inputNumber = getIntent().getIntExtra("inputNumber", 0);
        int maxPerfectSquare = getMaxPerfectSquare(inputNumber);
        int gridSize = (int) Math.sqrt(maxPerfectSquare);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridSize));
        MatrizAdapter adapter = new MatrizAdapter(maxPerfectSquare);
        recyclerView.setAdapter(adapter);
    }

    private int getMaxPerfectSquare(int number) {
        int i = 0;
        while (i * i <= number) {
            i++;
        }
        i--;
        return i * i;
    }
}