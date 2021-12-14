package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class arraydack {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
                adq.offerFirst(33);
                adq.offerLast(45);
                adq.offer(26);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()" + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollfirst()" + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast()" + adq);
    }
}
