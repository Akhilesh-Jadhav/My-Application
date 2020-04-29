package com.example.flipkartrecvw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context context;
    ArrayList<Model> models;

    public MyAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.example_item,null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mPrice.setText(models.get(i).getPrice());
        myHolder.mWeight.setText(models.get(i).getWeight());
        myHolder.mimageView.setImageResource(models.get(i).getImg());
        myHolder.mStrikeprice.setText(models.get(i).getStrikePrice());



    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
