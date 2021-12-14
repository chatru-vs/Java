package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnset {

    public static void main(String[] args) {

        Set<student> studentSet = new HashSet<>();
         studentSet.add(new student("Anuj", 2));
         studentSet.add(new student("Ramesh", 4));
         studentSet.add(new student("Mukesh", 56));
         studentSet.add(new student("Rohit", 4));

        student s1 = new student("Anuj", 2);
        student s2 = new student("rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);


//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//        System.out.println(set);
//        set.remove(54);
//        System.out.println(set);
//        System.out.println(set.contains(21));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);
    }
}

