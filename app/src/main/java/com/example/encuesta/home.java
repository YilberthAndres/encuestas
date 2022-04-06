package com.example.encuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button continuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        continuar= findViewById(R.id.ContinuarHo);

irPreguntas();


    }

    public void ir(){
        Intent intent = new Intent(this,EncuestaPreguntas.class);
        startActivity(intent);
        finish();
    }

    public void irPreguntas(){

        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ir();
            }

        });
    }
}