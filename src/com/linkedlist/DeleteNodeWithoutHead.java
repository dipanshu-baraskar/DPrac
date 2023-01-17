package com.linkedlist;

public class DeleteNodeWithoutHead {

    public static class Node {
        Node next;
        int data;

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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node deletedNode( int data) {
        Node toBeDeleted = new Node(data);
        if (toBeDeleted == null)  // If linked list is empty
            return null;
        else {
            if (toBeDeleted.next == null) {
                System.out.print("Last node can't be freed");
                return null;
            }
            // Copy data of the next node to the current node
            toBeDeleted.data = toBeDeleted.next.data;
            toBeDeleted.next = toBeDeleted.next.next;
            return null;
        }

    }

    public static void main(String[] args) {
        DeleteNodeWithoutHead ll = new DeleteNodeWithoutHead();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.deletedNode(10);

        ll.display();
    }
}
