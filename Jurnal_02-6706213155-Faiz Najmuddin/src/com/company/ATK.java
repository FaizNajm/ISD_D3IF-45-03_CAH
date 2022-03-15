package com.company;

public class ATK implements Comparable<ATK> {
    private String code;
    private String nama;
    private String stock;

    public ATK(String code, String nama, String stock) {
        this.code = code;
        this.nama = nama;
        this.stock = stock;
    }

    public String getNama() {
        return nama;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "ATK{" +
                "code='" + code + '\'' +
                ", nama='" + nama + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    @Override
    public int compareTo(ATK o) {
        return this.getNama().compareTo(o.getNama());
    }
}