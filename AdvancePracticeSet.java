package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AdvancePracticeSet {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
//        System.out.println(ar);
//        for (Object o: ar){
//            System.out.println(o);
//        }
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(56);
        s.add(578);
        s.add(5);
        s.add(6);
//        System.out.println(s);

//        System.out.println(d.getHours() + ":"+ d.getMinutes()+":"+d.getSeconds());

        LocalDateTime d1 = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String myDate = d1.format(df);
        System.out.println(myDate);
        }
    }

