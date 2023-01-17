package com.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void add(Integer n) {
        s1.push(n);
    }

    public int remove() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int op = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return op;
    }

    public int top() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int op = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return op;
    }



    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.top());
        System.out.println(q.remove());
        System.out.println(q.top());
        System.out.println(q.remove());
        System.out.println(q.top());
        System.out.println(q.remove());
        System.out.println(q.top());
        System.out.println(q.remove());
    }
}
