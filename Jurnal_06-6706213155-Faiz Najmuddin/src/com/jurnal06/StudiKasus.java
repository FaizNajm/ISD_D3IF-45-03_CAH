package com.jurnal06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudiKasus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        listMahasiswa.add(new Mahasiswa("123", "Nina", "D3IF 43-03"));
        listMahasiswa.add(new Mahasiswa("111", "Ria", "D3IF 43-02"));
        listMahasiswa.add(new Mahasiswa("100", "Siti", "D3IF 43-01"));
        listMahasiswa.add(new Mahasiswa("124", "Nina", "D3IF 43-04"));

        cetakList(listMahasiswa);

        System.out.println("Masukkan NIM mahasiswa yang dicari: ");
        String keyNim = input.nextLine();
        Mahasiswa mhsResult = cariMahasiswa(listMahasiswa, keyNim);
        System.out.print("Mahasiswa dengan NIM " + keyNim);
        System.out.println(" adalah: \n" + mhsResult);
    }

    private static void cetakList(ArrayList <Mahasiswa> arrayList) {
        for (Mahasiswa mhs : arrayList) {
            System.out.println(mhs);
        }
        System.out.println();
    }

    private static Mahasiswa cariMahasiswa(ArrayList<Mahasiswa> list, String nim) {
        Mahasiswa result;
        Collections.sort(list);
        int index = Collections.binarySearch(list, new Mahasiswa(nim, null, null));
        result = list.get(index);
        return result;
    }
}