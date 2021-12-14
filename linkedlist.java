package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class linkedlist {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(1, 50);
        System.out.println(list);
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println( list);
        System.out.println(list.get(1));

    }

}