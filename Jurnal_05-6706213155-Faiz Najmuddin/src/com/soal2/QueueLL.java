package com.soal2;

import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;

public class QueueLL<E> {
    private Queue<E> queueList;

    //constructor
    public QueueLL() {
        queueList = new LinkedList<E>();
    }

    public void enqueue(E object) {
        queueList.add(object);
    }

    // menghapus object dari queue
    public E dequeue() throws NoSuchElementException {
        return queueList.remove();
    }

    // menentukan jika queue kosong atau tidak
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // output isi queue
    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        int temp = 1;
        while (iterator.hasNext()) {

            Object value = iterator.next();
            System.out.println(temp + "." + value);
            temp++;
        }
    }
}