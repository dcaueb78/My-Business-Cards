package com.example.meuscartoes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastro extends AppCompatActivity {

    private Button backButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(backFunction);
    }

    private View.OnClickListener backFunction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            finish();
        }
    };

}
