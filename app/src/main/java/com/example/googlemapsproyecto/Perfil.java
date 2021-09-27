package com.example.googlemapsproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        textView = findViewById(R.id.descripcionAlumno);
        textView.setText(R.string.nombreAlumno);


    }

    public void volverMenu(View v){
        Intent intent = new Intent(this,Menu.class);
        intent.putExtra("user","francisco");
        startActivity(intent);
    }
}