package com.soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;

        QueueLL<String> queue = new QueueLL<>();

        printInstraction();
        while (!quit) {
            System.out.println("-----------------------");
            System.out.println("Masukan Pilihan:");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    printInstraction();
                    break;
                case 1:
                    System.out.print("-----------------------\n");
                    System.out.print("Cetak list :\n");
                    queue.printQueue();
                    System.out.println();

                    break;
                case 2:
                    System.out.print("Nama : ");
                    String nama = input.next();

                    queue.enqueue(nama);
                    System.out.println("-----------------------");
                    System.out.println("ToDo List Sudah Tersimpan!");
                    break;
                case 3:
                    if(queue.isEmpty()){
                        System.out.println("ToDo List Kosong!");
                    }else {
                        String removeQueue = queue.dequeue();
                        System.out.printf("%n%s selesai dikerjakan%n", removeQueue);
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
        System.out.println("1 - lihat To Do List");
        System.out.println("2 - tambah To Do List");
        System.out.println("3 - To Do List selesai di kerjakan");
        System.out.println("4 - keluar");

    }
}
