package com.company;

public class Lagu {

    private String judulLagu;
    private String namaPenyanyi;

    public Lagu(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    @Override
    public String toString() {
        return "Judul='" + judulLagu + '\'' + ", Penyanyi='" + namaPenyanyi;

    }
}