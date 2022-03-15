package com.company;

public class ListNode<E> {
    E data;
    ListNode<E> next;

    public ListNode(E object) {
        this.data = object;
        this.next = null;
    }

    public E getData() {
        return data;
    }
}