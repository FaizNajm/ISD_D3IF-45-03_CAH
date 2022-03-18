package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;

        LinkedList<Lagu> listLagu = new LinkedList<>();


        printInstraction();
        while (!quit) {
            System.out.println("-----------------------");
            System.out.println("Masukan Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    printInstraction();
                    break;
                case 1:
                    ListIterator<Lagu> iterator = listLagu.listIterator();
                    if(listLagu.size() == 0){
                        System.out.println("-----------------------");
                        System.out.println("Playlist Kosong");
                    } else {
                        System.out.print("-----------------------");
                        System.out.print("\nCetak maju list\n");
                        System.out.println("-----------------------");
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                        System.out.print("\n-----------------------");
                        System.out.print("\nCetak mundur list\n");
                        System.out.println("-----------------------");
                        while (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Judul : ");
                    String judul = input.next();
                    System.out.print("Nama Penyanyi : ");
                    String nama = input.next();

                    listLagu.addLast(new Lagu(judul, nama));
                   /* listBarang.add(new Lagu("001", "Susu Kedelai"));
                    listBarang.addFirst(new Lagu("003", "Topi"));
                    listBarang.add(2, new Lagu("005", "Tiara"));*/
                    System.out.println("-----------------------");
                    System.out.println("Lagu Sudah Tersimpan!");
                    break;
                case 3:
                    ListIterator<Lagu> iter = listLagu.listIterator();
                    System.out.println("Hapus lagu terakhir? (y/n)");
                    String pilihan1 = input.next();
                    if (listLagu.size() == 0){
                        System.out.println("-----------------------");
                        System.out.println("Playlist Kosong");
                    }
                    else if (pilihan1.equals("y")) {
                        while (iter.hasNext()) {
                            listLagu.remove(listLagu.size()-1);
                        }


                    } else {
                        System.out.println("Hapus lagu dengan judul? *case sensitive");
                        String pilihan2 = input.next();
                        while (iter.hasNext()) {
                            Lagu temp = iter.next();
                            if (temp.getJudulLagu().equals(pilihan2)) {
                                iter.remove();
                            }
                        }
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
        System.out.println("1 - Play");
        System.out.println("2 - tambah lagu");
        System.out.println("3 - hapus lagu");
        System.out.println("4 - keluar");

    }
}