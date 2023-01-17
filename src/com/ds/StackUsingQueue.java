package com.ds;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> q1;
    Queue<Integer> q2;

    StackUsingQueue() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    public void add(Integer n) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(n);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public int remove() {
        return q1.poll();
    }

    public int top() {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        int op = q2.peek();
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return op;
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
