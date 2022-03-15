package com.company;

public class Pegawai {
    private String nip;
    private String nama;
    private String divisi;

    public Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "nim='" + nip + '\'' + ", nama='" + nama + '\'' + ", kelas='" + divisi + '\'';
    }
}