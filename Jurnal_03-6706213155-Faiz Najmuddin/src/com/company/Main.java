package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;

        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();
        printInstraction();

        while (!quit) {
            System.out.println("Masukan Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    printInstraction();
                    break;
                case 1:
                    linkedList.print();
                    break;
                case 2:
                    System.out.print("NIP : ");
                    String nip = input.next();
                    System.out.print("Nama : ");
                    String nama = input.next();
                    System.out.print("Divisi : ");
                    String divisi = input.next();
                    System.out.println("Tambahkan data di awal list? (y/n)");
                    String pilihan = input.next();
                    if (pilihan.contains("y")) {
                        linkedList.insertAtFront(new Pegawai(nip, nama, divisi));
                    } else {
                        linkedList.insertAtBack(new Pegawai(nip, nama, divisi));
                    }
                    System.out.println("-----------------------");
                    System.out.println("Data Sudah Tersimpan!");
                    System.out.println("-----------------------");
                    break;
                case 3:
                    System.out.println("Hapus data di awal list? (y/n)");
                    String pilihan1 = input.next();
                    if (pilihan1.contains("y")) {
                        linkedList.removeFromFront();
                    } else {
                        linkedList.removeFromBack();
                    }
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstraction() {
        System.out.println("\nTekan");
        System.out.println("0 - melihat opsi pilihan");
        System.out.println("1 - cetak data");
        System.out.println("2 - tambah data");
        System.out.println("3 - hapus data");
        System.out.println("4 - keluar");

    }

    /*public static void printInstraction1() {
        System.out.println("\nTekan");
        System.out.println("0 - melihat opsi pilihan");
        System.out.println("1 - melihat ATK");
        System.out.println("2 - melihat Bag");
    }

    public static void printInstraction2() {
        System.out.println("\nTekan");
        System.out.println("0 - melihat opsi pilihan");
        System.out.println("1 - add ATK");
        System.out.println("2 - add Bag");
    }*/
}
