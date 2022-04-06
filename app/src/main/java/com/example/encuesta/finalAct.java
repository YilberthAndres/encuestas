package com.example.encuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finalAct extends AppCompatActivity {
    Button btnSalir, btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        btnSalir  = findViewById(R.id.salir);
        btnVolver = findViewById(R.id.volver);

        VolverI();
    }

    public void nuevaEncuesta(){
        Intent intent = new Intent(this,EncuestaPreguntas.class);
        startActivity(intent);
        finish();
    }

    public void VolverI(){
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nuevaEncuesta();
            }

        });
    }

    public void salirE(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void salirF()
    {
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                salirE();
            }

        });
    }
}