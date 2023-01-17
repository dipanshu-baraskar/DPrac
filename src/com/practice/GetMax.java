package com.practice;

import java.util.Stack;

public class GetMax {

    Stack<Integer> stack = new Stack<>();
    int maxEle;

    private void add(int i) {
        if (stack.isEmpty()) {
            maxEle = i;
            stack.push(i);
            return;
        }
        if (i > maxEle) {
            maxEle = i;
            stack.push(2 * i - maxEle);
        } else {
            stack.push(i);
        }

    }

    private void remove() {
        if (stack.isEmpty()) {
            return;
        }
        int t = stack.peek();
        stack.pop();

        if (t > maxEle) {
            maxEle = maxEle * 2 - t;
        }
    }

    private void getMax() {
        if (stack.isEmpty()) {
            System.out.println("Empty");
        }
        System.out.println(stack.peek());
    }

    public static void main(String[] args) {
        GetMax s = new GetMax();
        s.add(3);
        s.add(5);
        s.getMax();
        s.add(7);
        s.add(19);
        s.getMax();
        s.remove();
        s.getMax();
        s.remove();
        s.getMax();

    }
}
