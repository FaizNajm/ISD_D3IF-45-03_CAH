package com.company;

import java.util.Scanner;

public class GenericDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;

        GenArrayList<Bag> bagList = new GenArrayList<>(5);
        GenArrayList<ATK> atkList = new GenArrayList<>(5);
        printInstraction();

        while (!quit) {
            System.out.println("Masukan Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    printInstraction();
                    break;
                case 1:
                    atkList.display();
                    bagList.display();
                    break;
                case 2:
                    System.out.print("Code : ");
                    String code = input.next();
                    System.out.print("Nama : ");
                    String nama = input.next();
                    System.out.print("Stock : ");
                    String stock = input.next();
                    if (code.contains("A") || code.contains(("B"))) {
                        atkList.addData(new ATK(code, nama, stock));
                    } else {
                        Bag bg = new Bag(code, nama, stock);
                        bagList.addData(bg);
                    }
                    System.out.println("Barang Sudah Tersimpan!");
                    break;
                case 3:

                    atkList.display();
                    System.out.println("\nHapus barang ATK no: ( masukan (0) jika tidak ada )");
                    int choice1 = input.nextInt();
                    if (choice1 != 0) {
                        atkList.removeData(choice1 - 1);
                    }
                    /*while(choice1 != 0) {
                    }*/
                    bagList.display();
                    System.out.println("\nHapus barang Bag no: ( masukan (0) jika tidak ada )");
                    int choice2 = input.nextInt();
                    if (choice2 != 0) {
                        bagList.removeData(choice2 - 1);
                    }
                    /*while(choice2 != 0) {
                    }*/
                    break;
                case 4:
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstraction() {
        System.out.println("\nTekan");
        System.out.println("0 - melihat opsi pilihan");
        System.out.println("1 - melihat barang");
        System.out.println("2 - tambah barang");
        System.out.println("3 - hapus barang");
        System.out.println("4 - mengubah stock barang");
        System.out.println("5 - keluar");

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