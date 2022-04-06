package com.example.encuesta.Entidades;

public class Usuario {
    private Integer id;
    private Integer pregunta1;
    private Integer pregunta2;
    private Integer pregunta3;
    private Integer pregunta4;
    private Integer pregunta5;


    public Usuario(Integer id, Integer pregunta1, Integer pregunta2, Integer pregunta3, Integer pregunta4, Integer pregunta5) {
        this.id = id;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
        this.pregunta5 = pregunta5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(Integer pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public Integer getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(Integer pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public Integer getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(Integer pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public Integer getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(Integer pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public Integer getPregunta5() {
        return pregunta5;
    }

    public void setPregunta5(Integer pregunta5) {
        this.pregunta5 = pregunta5;
    }
}
