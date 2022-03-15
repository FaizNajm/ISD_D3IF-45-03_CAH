package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class GenArrayList<E extends Comparable<? super E>> {
    private final ArrayList<E> list;

    public GenArrayList(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 0;
        list = new ArrayList<>();
    }

    public void addData(E values) {
        list.add(values);
    }

    public void display() {
        int temp = 1;
        for (int i = 0; i < list.size(); i++) {
            /*System.out.println(list.size());
            System.out.println("Index ke "+ i +" \n"+ list.get(i));*/
            System.out.printf("\n " + temp + " " + list.get(i) + " ");
            temp++;
        }
        System.out.println();
    }

    public void displaySort() {
        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            System.out.printf("\n" + i + " " + list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(int entry) {
        list.remove(entry);
    }

    public void setData(int object1, int object2) {
        int index = list.indexOf(object1);
        list.add(index, object2);
    }

}