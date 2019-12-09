package com.example.meuscartoes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListaCardsAdapter extends RecyclerView.Adapter<ListaCardsAdapter.ListaCardsViewHolder> {

    @NonNull
    @Override
    public ListaCardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate();

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListaCardsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ListaCardsViewHolder extends RecyclerView.ViewHolder {

        public ListaCardsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
