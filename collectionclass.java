package com.company;
import java.util.*;

import static java.util.Collections.*;

public class collectionclass {
    public static void main(String[] args) {
        List<student> list = new ArrayList<>();
        list.add(new student("Anuj", 2));
        list.add(new student("Ramesh", 4));
        list.add(new student("Shivam", 3));
        list.add(new student("Rohit", 1));

        student s1 = new student("Anuj", 2);
        student s2 = new student("Ramesh", 4);

        System.out.println(s1.compareTo(s2));
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(list);



//        List.add(34);
//        List.add(55);
//        List.add(67);
//        List.add(88);
//        List.add(45);
//        System.out.println("min element " + Collections.min(List));
//        System.out.println("max element " + Collections.max(List));
//        System.out.println(Collections.frequency(List, 88));
//        Collections.sort(List);
//        System.out.println(List);

    }
}
