package com.example.examena;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class CuadroHolder extends RecyclerView.ViewHolder {
        TextView textView;

        CuadroHolder(@NonNull View itemView) { //Constructor de CuadroHolder. Toma una vista itemView como parámetro
            super(itemView); //Esto inicializa el ViewHolder con la vista proporcionada
            textView = itemView.findViewById(R.id.textView); //Vincula la variable textView con el TextView definido en el XML de cada elemento
        }
}
