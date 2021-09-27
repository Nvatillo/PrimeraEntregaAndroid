package com.example.googlemapsproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    private String userName;
    private TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        userName = getIntent().getStringExtra("user");
        titulo = findViewById(R.id.tituloBienvenida);

        titulo.setText("Bienvenido "+userName);

    }


    public void iraPerfil(View v){
        Intent intent = new Intent(this,Perfil.class);
        startActivity(intent);
    }

    public void iraRamos(View v){
        Intent intent = new Intent(this,Ramos.class);
        startActivity(intent);
    }
}