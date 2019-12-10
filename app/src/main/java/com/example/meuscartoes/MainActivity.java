package com.example.meuscartoes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import data.model.Card;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btnAdd = findViewById(R.id.btnCreate);
        btnAdd.setOnClickListener(addButton);

        RecyclerView recyclerCartoes = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerCartoes.setLayoutManager(linearLayoutManager);
        recyclerCartoes.setAdapter(new ListaCardsAdapter(criaCards()));
    }

    private View.OnClickListener addButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast toast=Toast.makeText(getApplicationContext(),"Hello batatinha",Toast.LENGTH_SHORT);
            toast.show();

            Intent intent = new Intent(MainActivity.this, cadastro.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
        }
    };

    private List<Card> criaCards() {
        return Arrays.asList(
                new Card("Tarefa 1"),
                new Card("Tarefa 2"),
                new Card("Tarefa 3"),
                new Card("Tarefa 4")
        );
    }
}
