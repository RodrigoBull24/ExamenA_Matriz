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

    private final int itemCount;

    public MatrizAdapter(int itemCount) {
        this.itemCount = itemCount;
    }

    @NonNull
    @Override
    public CuadroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_matriz_adapter, parent, false);
        return new CuadroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CuadroHolder holder, int position) {
        holder.textView.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }
}