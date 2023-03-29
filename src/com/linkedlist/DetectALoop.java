package com.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectALoop {
    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    private void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private boolean detectLoop(Node head) {
        Node fpr = head;
        Node spr = head;

        while (fpr != null && spr != null) {
            spr = spr.next;
            fpr = fpr.next.next;
            if (spr == fpr) {
                return true;
            }
        }
        return false;
    }

    private boolean detectLoop2(Node head) {
        Set<Node> set = new HashSet<>();
        Node temp = head;
        while (temp.next != null) {
            if (set.contains(temp)) {
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectALoop ll = new DetectALoop();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.head.next.next.next.next = ll.head;

        System.out.println(ll.detectLoop(ll.head));
        System.out.println(ll.detectLoop2(ll.head));


    }
}
