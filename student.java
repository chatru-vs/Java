package com.company;

import java.util.Objects;

public class student implements Comparable<student> {
    String name;
    int rollNo;

    public  student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }



    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }


    @Override
    public int compareTo(student that) {
        return this.rollNo - that.rollNo;
    }
}
