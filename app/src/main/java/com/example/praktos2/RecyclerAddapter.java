package com.example.praktos2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAddapter extends RecyclerView.Adapter<RecyclerAddapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<State> states;

    public RecyclerAddapter(Context context, List<State> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView;
        final TextView capitalView;

        ViewHolder(View view) {
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }


    @Override
    public RecyclerAddapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAddapter.ViewHolder holder, int position) {
        State state = states.get(position);


        holder.flagView.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getCapital());


        holder.flagView.setOnClickListener(v -> {

            Intent intent = new Intent(inflater.getContext(), DetailActivity.class);
            intent.putExtra("name", state.getName());
            intent.putExtra("capital", state.getCapital());
            intent.putExtra("flag", state.getFlagResource());
            intent.putExtra("description", state.getDescription());
            inflater.getContext().startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return states.size();
    }
}
