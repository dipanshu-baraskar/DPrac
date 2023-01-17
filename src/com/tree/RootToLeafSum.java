package com.tree;

public class RootToLeafSum {

    public static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    private static boolean hasSum(Node rootNode, int sum) {
        if (rootNode == null) {
            return false;
        }

        boolean ans = false;

        int subSum = sum - rootNode.data;
        if (subSum == 0 && rootNode.left == null && rootNode.right == null) {
            return true;
        }
        if (rootNode.left != null) {
            ans = ans || hasSum(rootNode.left, subSum);
        }

        if (rootNode.right != null) {
            ans = ans || hasSum(rootNode.right, subSum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node n = new Node(10);
        n.left = new Node(8);
        n.left.left = new Node(3);
        n.left.right = new Node(5);
        n.right = new Node(2);
        n.right.left = new Node(2);
        System.out.println(hasSum(n, 21));
        inOrder(n);
    }

    private static void inOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inOrder(rootNode.left);
        System.out.print(rootNode.data + " ");
        inOrder(rootNode.right);
    }
}
