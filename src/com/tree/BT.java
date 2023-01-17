package com.tree;

import java.util.Scanner;

public class BT {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node n=createTree();
    }

    public static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node createTree() {
        Node root;
        System.out.println("Enter Data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left node for: " + root.data);
        root.left = createTree();
        System.out.println("Enter right node for: " + root.data);
        root.right = createTree();

        return root;
    }

    public static void inOrder(Node n){
        if(n==null){
            return;
        }

        inOrder(n.left);
    }

}
