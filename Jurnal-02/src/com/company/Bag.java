package com.company;

public class Bag implements Comparable<Bag> {
    private String code;
    private String nama;
    private String stock;

    public Bag(String code, String nama, String stock) {
        this.code = code;
        this.nama = nama;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }



    @Override
    public String toString() {
        return "Bag{" +
                "code='" + code + '\'' +
                ", nama='" + nama + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bag o) {
        return this.getCode().compareTo(o.getCode());
    }
}