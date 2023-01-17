package com.linkedlist;

public class MyLinkedList {
    private Node head;

    public void add(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;

    }

    public void delete(Node n) {
        Node temp = head;
        while (temp.next != null) {

        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.add(10);
        ll.add(20);
        System.out.println(ll);

    }
}
