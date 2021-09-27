package com.example.googlemapsproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.userName);
        password = findViewById(R.id.pasword);


    }



    public void entrar(View v){
        String user = userName.getText().toString();
        String pass = password.getText().toString();
        if (user.equals("francisco") && pass.equals("francisco")) {
            Toast mensajeExito = Toast.makeText(getApplicationContext(), "Bienvenido "+user, Toast.LENGTH_SHORT);
            mensajeExito.show();
            Intent intent = new Intent(this, Menu.class);
            intent.putExtra("user",user);
            startActivity(intent);
        }else{
            Toast mensajeError = Toast.makeText(getApplicationContext(), "Usuario o Contraseña Erronia", Toast.LENGTH_SHORT);
            mensajeError.show();
        }
    }
}