package com.example.meuscartoes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cadastro extends AppCompatActivity {

    private Button backButton;
    private Button cadastroButton;
    private EditText text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(backFunction);

        cadastroButton = (Button)  findViewById(R.id.button);
        cadastroButton.setOnClickListener(cadastroFunction);
    }

    private View.OnClickListener backFunction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            finish();
        }
    };

    private View.OnClickListener cadastroFunction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            text   =  findViewById(R.id.editText);

            if(text.getText().toString().length()>5 && text.getText().toString().length()<7){
                Toast toast=Toast.makeText(getApplicationContext(),"Cadastrado com sucesso",Toast.LENGTH_SHORT);
                toast.show();
                finish();

            } else {
                Toast toast=Toast.makeText(getApplicationContext(),"Digite um código válido!",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };

}
