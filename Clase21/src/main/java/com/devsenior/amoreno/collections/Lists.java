package com.devsenior.amoreno.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public void perfomDemo() {
        List<Number> list = new ArrayList();
        list.add(1);
        list.add(10.0);
        list.add(30L);
        list.add(0, 15f);

        for (var number: list) System.out.println(number);


//        for (var element : list) {
//            System.out.println(element);
//        }
//
//        var list2 = new ArrayList<String>();
//            list2.add("Esto es un nuevo elemento");
//            list2.addAll(list);
//
//        list.remove("10.0");
//        System.out.println("Eliminado elementos");
//        while (list.isEmpty()) {
//            System.out.println(list.removeFirst());
//        }
//        System.out.println("Imprimiendo la lista");
//        System.out.println(list);
//        System.out.println(list2);
    }
}
