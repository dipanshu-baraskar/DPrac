package com.tree;

import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }

    public static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node createTree() {
        Node root = null;
        System.out.println("Enter Data:");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left for " + root.data);
        root.left = createTree();
        System.out.println("Enter right for " + root.data);
        root.right = createTree();
        return root;
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


}
