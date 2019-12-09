package com.example.meuscartoes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListaCardsAdapter extends RecyclerView.Adapter<ListaCardsAdapter.ListaCardsViewHolder> {

    @NonNull
    @Override
    public ListaCardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcard, parent, false);

        return new ListaCardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaCardsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ListaCardsViewHolder extends RecyclerView.ViewHolder {

        private TextView textTituloCard;

        public ListaCardsViewHolder(@NonNull View itemView) {
            super(itemView);

            textTituloCard = itemView.findViewById(R.id.text_titulo_card);

            textTituloCard.setText("Cartão showwww");
        }
    }
}
