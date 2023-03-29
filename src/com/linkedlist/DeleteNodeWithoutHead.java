package com.linkedlist;

public class DeleteNodeWithoutHead {

    public static class Node {
        private Node next;
        private int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void insert(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void deletedNode(Node n) {
        if (n.next == null) {
            System.out.print("Last node can't be freed");
            return;
        }
        n.data = n.next.data;
        n.next = n.next.next;
    }

    public static void main(String[] args) {
        DeleteNodeWithoutHead ll = new DeleteNodeWithoutHead();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.display();

        ll.deletedNode(ll.head.next.next);

        ll.display();
    }
}
