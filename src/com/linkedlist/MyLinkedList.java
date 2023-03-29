package com.linkedlist;

public class MyLinkedList {
    public class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    private void add(int value) {
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

    private void delete(Node n) {
        Node temp = head;
        while (temp.next != null) {

        }
    }

    private void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
