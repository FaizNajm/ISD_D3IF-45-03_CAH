package com.jurnal06;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return this.getNim().compareTo(o.getNim());
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + getNim() + '\'' +
                ", nama='" + getNama() + '\'' +
                ", kelas='" + getKelas() + '\'' +
                '}';
    }
}