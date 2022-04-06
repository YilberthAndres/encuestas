package com.example.encuesta.preguntas;

import com.example.encuesta.EncuestaPreguntas;

public class preguntas {

    public String numPregunta(int num){

        switch (num)
        {
            case 1: return "Pregunta numero 1";
            case 2: return "Pregunta numero 2";
            case 3: return "Pregunta numero 3";
            case 4: return "Pregunta numero 4";
            case 5: return "Pregunta numero 5";
        }
        return "Hola error";
    }

    public String Preguntas(int num){

        switch (num)
        {
            case 1: return "¿CÓMO CALIFICARÍA EL PROCESO DE GESTIONAMIENTO DE CITAS?";
            case 2: return "¿AL MOMENTO DE SOLICITAR UNA CITA MÉDICA EL GESTIONAMIENTO ES?";
            case 3: return "¿CUÁNDO SOLICITA UNA CITA MÉDICA POR CUAL MEDIO LO REALIZA?";
            case 4: return "¿EL TIEMPO PARA GESTIONAR UNA CITA MÉDICA ES?";
            case 5: return "¿LE GUSTARÍA GESTIONAR UNA CITA MÉDICA DESDE LA COMODIDAD DE SU CASA?";
        }
        return "Hola error";
    }

    public String Solu1(int num){

        switch (num)
        {
            case 1: return " Muy bueno";
            case 2: return " Muy bueno";
            case 3: return " Paginca Web";
            case 4: return " Muy corto";
            case 5: return " Si";
        }
        return "Hola error1";
    }

    public String Solu2(int num){

        switch (num)
        {
            case 1: return " bueno";
            case 2: return " Bueno";
            case 3: return " Aplicativo Movil";
            case 4: return " Corto";
            case 5: return " Tal vez";
        }
        return "Hola error2";
    }

    public String Solu3(int num){

        switch (num)
        {
            case 1: return " Ni bueno ni malo";
            case 2: return " Ni bueno ni malo";
            case 3: return " Telefono";
            case 4: return " Ni corto ni largo";
            case 5: return " De pronto";
        }
        return "Hola error";
    }

    public String Solu4(int num){

        switch (num)
        {
            case 1: return " Malo";
            case 2: return " Malo";
            case 3: return " Presencial";
            case 4: return " Largo";
            case 5: return " No";
        }
        return "Hola error";
    }
    public String Solu5(int num){

        switch (num)
        {
            case 1: return " Muy malo";
            case 2: return " Muy malo";
            case 3: return " Ninguna de las anteriores";
            case 4: return " Muy largo";
            case 5: return " Nunca";
        }
        return "Hola error";
    }
}
