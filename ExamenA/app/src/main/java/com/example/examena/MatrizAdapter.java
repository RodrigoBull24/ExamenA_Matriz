package com.example.examena;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MatrizAdapter extends RecyclerView.Adapter<CuadroHolder> {

    private final int itemCount; //Numero total de elementos de la cuadrícula

    public MatrizAdapter(int itemCount) {
        this.itemCount = itemCount;
    }

    @NonNull
    @Override
    public CuadroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //El método se llama cuando el RecyclerView crea  una nueva vista para un elemento y crea una instancia (cuadroHolder)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_matriz_adapter, parent, false);
        return new CuadroHolder(view); //Devuelve la instancia
    }

    @Override
    public void onBindViewHolder(@NonNull CuadroHolder holder, int position) { //Vincula los datos a una vista específica en una posición
        holder.textView.setText(String.valueOf(position + 1)); //Escribe el texto del TextView en el CuadroHolder con el valor de la posición (más 1) desde el 1 hasta el ItemCount
    }

    @Override
    public int getItemCount() {
        return itemCount;
    } //Devuelve el número  de elementos que se muestran en el RecyclerView
}