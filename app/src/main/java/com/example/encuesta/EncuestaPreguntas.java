package com.example.encuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.encuesta.preguntas.preguntas;

public class EncuestaPreguntas extends AppCompatActivity {
    TextView numPregunta, Pregunta, solu1,solu2,solu3,solu4,Solu5;
    int numPreg = 1;
    String trigger = "";
    Button sig;
    preguntas pre = new preguntas();

    int res1,res2,res3,res4,res5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_preguntas);

        numPregunta = findViewById(R.id.numeroPregunta);
        Pregunta = findViewById(R.id.pregunta);
        solu1 = findViewById(R.id.opcion1);
        solu2 = findViewById(R.id.opcion2);
        solu3 = findViewById(R.id.opcion3);
        solu4 = findViewById(R.id.opcion4);
        Solu5 = findViewById(R.id.opcion5);
        sig  = findViewById(R.id.sigPregunta);

        sig.setVisibility(View.GONE);
        cambioPreguna();
        eventosSol();
        clickCon();
    }


    public void lleanarregunta(String numPre, String preg, String sol1, String sol2, String sol3, String sol4, String sol5){

        numPregunta.setText(numPre);
        Pregunta.setText(preg);
        solu1.setText(sol1);
        solu2.setText(sol2);
        solu3.setText(sol3);
        solu4.setText(sol4);
        Solu5.setText(sol5);

    }
    public void guardarDatos(View view)
    {
        Administrador admin = new Administrador(this);
        SQLiteDatabase BasedeDatos = admin.getWritableDatabase();
        try {


            ContentValues registro = new ContentValues();
            registro.put("pregunta1", res1);
            registro.put("pregunta2", res2);
            registro.put("pregunta3", res3);
            registro.put("pregunta4", res4);
            registro.put("pregunta5", res5);

            BasedeDatos.insert("encuestador", null, registro);
            BasedeDatos.close();
            mensaje("Ta buenaaa esa base");
        }catch (Exception a){
            mensaje("Ta mala esa base");
        }
    }

    public void BuscarDato(){

    }

    public void eventosSol(){
        solu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trigger = "solucion1";

                sig.setVisibility(View.VISIBLE);

            }

        });

        solu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trigger = "solucion2";
                sig.setVisibility(View.VISIBLE);

            }

        });
        solu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trigger = "solucion3";
                sig.setVisibility(View.VISIBLE);


            }

        });

        solu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trigger = "solucion4";
                sig.setVisibility(View.VISIBLE);

            }

        });
        Solu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trigger = "solucion4";
                sig.setVisibility(View.VISIBLE);

            }

        });


    }
    public void mensaje(String trigge){
        Toast.makeText(this, trigge, Toast.LENGTH_LONG).show();

    }

    public void EventosB(){
        //mensaje("ESTAS DANDO CLICK");
        if(trigger == "solucion1" || trigger == "solucion2" || trigger == "solucion3" || trigger == "solucion4" || trigger == "solucion5" ){

            switch (numPreg){

                case 1:
                    res1 = deRespuesta(trigger) +1;
                    trigger = "";
                    numPreg = numPreg + 1;
                    sig.setVisibility(View.GONE);
                    cambioPreguna();
                    break;
                case 2:
                    res2 = deRespuesta(trigger) +1;
                    trigger = "";
                    numPreg = numPreg + 1;
                    sig.setVisibility(View.GONE);
                    cambioPreguna();
                    break;
                case 3:
                    res3 = deRespuesta(trigger) +1;
                    trigger = "";
                    numPreg = numPreg + 1;
                    sig.setVisibility(View.GONE);
                    cambioPreguna();
                    break;
                case 4:
                    res4 = deRespuesta(trigger) +1;
                    trigger = "";
                    numPreg = numPreg + 1;
                    sig.setVisibility(View.GONE);
                    cambioPreguna();
                    break;
                case 5:
                    res5 = deRespuesta(trigger) +1;
                    trigger = "";
                    numPreg = 0;


                    sig.setVisibility(View.GONE);
                    Intent intent = new Intent(this, finalAct.class);
                    startActivity(intent);
                    finish();
                    break;
            }
        }else{
            mensaje("ERROR");
        }
    }

    public Integer deRespuesta (String respuesta){
        switch (respuesta){
            case "solucion1": return 0;
            case "solucion2": return 1;
            case "solucion3": return 2;
            case "solucion4": return 3;
            case "solucion5": return 4;

        }
        return 1;
    }

    public void clickCon(){
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventosB();
            }

        });
    }


    public void cambioPreguna(){
        lleanarregunta(pre.numPregunta(numPreg),pre.Preguntas(numPreg),pre.Solu1(numPreg),pre.Solu2(numPreg),pre.Solu3(numPreg),pre.Solu4(numPreg),pre.Solu5(numPreg));
    }
}