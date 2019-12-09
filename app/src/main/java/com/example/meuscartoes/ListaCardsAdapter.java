package com.example.meuscartoes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import data.model.Card;

public class ListaCardsAdapter extends RecyclerView.Adapter<ListaCardsAdapter.ListaCardsViewHolder> {

    private List<Card> cards;

    public ListaCardsAdapter(List<Card> cards) {
        this.cards = cards;
    }

    @NonNull
    @Override
    public ListaCardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcard, parent, false);

        return new ListaCardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaCardsViewHolder holder, int position) {
        holder.textTituloCard.setText(cards.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return (cards != null & cards.size() > 0) ? cards.size() : 0;
    }

    static class ListaCardsViewHolder extends RecyclerView.ViewHolder {

        private TextView textTituloCard;

        public ListaCardsViewHolder(@NonNull View itemView) {
            super(itemView);

            textTituloCard = itemView.findViewById(R.id.text_titulo_card);

        }
    }
}
