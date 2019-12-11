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
import network.ApiService;
import network.response.CardsResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerCartoes;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btnAdd = findViewById(R.id.btnCreate);
        btnAdd.setOnClickListener(addButton);

        RecyclerView recyclerCartoes = findViewById(R.id.recyclerView);

//        recyclerCartoes = findViewById(R.id.recyclerView);
//
//        ApiService.getInstance()
//                .obterCardsPopulares()
//                .enqueue(new Callback<CardsResult>() {
//                    @Override
//                    public void onResponse(Call<CardsResult> call, Response<CardsResult> response) {
//                        if(response.isSuccessful()){
//                            response.body().getResultadoCards();
//                            RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
//                            recyclerCartoes.setLayoutManager(linearLayoutManager);
//                            recyclerCartoes.setAdapter(new ListaCardsAdapter(response.body().getResultadoCards()));
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<CardsResult> call, Throwable t) {
//
//                        Toast toast=Toast.makeText(getApplicationContext(),"Falha ao conectar!",Toast.LENGTH_SHORT);
//                        toast.show();
//                    }
//                });
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerCartoes.setLayoutManager(linearLayoutManager);
        recyclerCartoes.setAdapter(new ListaCardsAdapter(criaCards()));
    }

    private View.OnClickListener addButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, cadastro.class);
            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
        }
    };

    private List<Card> criaCards() {
        return Arrays.asList(
                new Card("Cauê - Geosapiens", "Desenvolvedor ReactJS", "99715-3169"),
                new Card("Pleez", "Aplicativo que vai revolucionar a forma como garçons atendem seus clientes", "www.pleez.com"),
                new Card("GeoSapiens", "GeoSapiens Tecnologia e Informação LTDA", "www.geosapiens.com.br"),
                new Card("Qualyteam", "Ideal para atendimento à norma ISO 9001", "www.qualyteam.com"),
                new Card("Pleez", "Aplicativo que vai revolucionar a forma como garçons atendem seus clientes", "www.pleez.com"),
                new Card("GeoSapiens", "GeoSapiens Tecnologia e Informação LTDA", "www.geosapiens.com.br"),
                new Card("Pleez", "Aplicativo que vai revolucionar a forma como garçons atendem seus clientes", "www.pleez.com"),
                new Card("GeoSapiens", "GeoSapiens Tecnologia e Informação LTDA", "www.geosapiens.com.br"),
                new Card("Qualyteam", "Ideal para atendimento à norma ISO 9001", "www.qualyteam.com")
        );
    }
}
