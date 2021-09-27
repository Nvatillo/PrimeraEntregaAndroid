package com.example.googlemapsproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ramos extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramos);

        button = findViewById(R.id.buttonvolverMenu);
    }

    public void volverAlMenu(View v){
        Intent intent = new Intent(this,Menu.class);
        intent.putExtra("user","francisco");
        startActivity(intent);
    }
}