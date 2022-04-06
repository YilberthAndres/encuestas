package com.example.encuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.*;

public class MainActivity extends AppCompatActivity {

    Button btnIniciar;
    EditText textoUsuario, textoClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = findViewById(R.id.Iniciar);
        textoUsuario = findViewById(R.id.CorreoR);
        textoClave = findViewById(R.id.Contra);

        EventosIniciar();

        Administrador admin = new Administrador(this);
        SQLiteDatabase database = admin.getWritableDatabase();

        if(database != null){
            Toast.makeText(this, "BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "BASE DATOS NO FUE CREADA", Toast.LENGTH_LONG).show();
        }
    }


    public void siguiente() {
        if (textoUsuario.getText().toString().equals("")) {
            Toast.makeText(this, "Debe escribir un nombre de usuario", Toast.LENGTH_LONG).show();
        } else if (textoClave.getText().toString().equals("")) {
            Toast.makeText(this, "Debe escribir una Contraseña", Toast.LENGTH_LONG).show();

        } else if ((textoUsuario.getText().toString().equals("admin")) && (textoClave.getText().toString().equals("admin"))) {
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuario no valido", Toast.LENGTH_LONG).show();
        }
    }

    public void EventosIniciar() {
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                siguiente();

            }


        });
    }




}