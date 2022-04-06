package com.example.encuesta.Utilidades;

public class Utilidades {
    //BASE

    public static final String TABLA_ENCUESTAS = "encuestas";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_PREGUNTA1   = "pregunta1";
    public static final String CAMPO_PREGUNTA2   = "pregunta2";
    public static final String CAMPO_PREGUNTA3   = "pregunta3";
    public static final String CAMPO_PREGUNTA4   = "pregunta4";
    public static final String CAMPO_PREGUNTA5   = "pregunta5";



    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE "+TABLA_ENCUESTAS+
            "("+CAMPO_ID+" INTEGER, "+CAMPO_PREGUNTA1+" INTEGER, "+CAMPO_PREGUNTA2+
            " INTEGER, "+CAMPO_PREGUNTA3+" INTEGER, "+CAMPO_PREGUNTA4+" INTEGER, "+CAMPO_PREGUNTA5+" INTEGER, "+")";

}
