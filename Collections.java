package com.company;
import java.util.*;
public class Collections {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(5);
        l1.add(7);
        l1.addLast(4);
        l1.addFirst(8);
//        System.out.println(l1);
        ArrayDeque<Integer> l2 = new ArrayDeque<>(5);
        l2.add(45);
//        System.out.println(l2);
        HashSet<Integer> l = new HashSet<>(80,0.75f);
        l.add(21);
        l.add(21);
        l.add(34);
        l.clear();
        System.out.println(l);

    }
}
