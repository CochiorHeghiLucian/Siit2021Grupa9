package com.siit;

import com.siit.ex1.Box;
import com.siit.ex1.Pair;
import com.siit.ex1.SameTypePair;
import com.siit.ex1.SimplePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();

        Box<Integer> box = new Box<>(10);
        Box<String> box2 = new Box<>("String value");
        Box<Double> box3 = new Box<>(12.3);

        Pair<Integer, Integer> integerIntegerSimplePair = new SimplePair<>(11, 12);
        SimplePair<String, Integer> integerIntegerSimplePair2 = new SimplePair<String, Integer>("11", 12);
        SimplePair<String, Double> integerIntegerSimplePair3 = new SimplePair<>("11", 12.12);

        Pair<Integer, Integer> integerIntegerSimplePair1 = new SameTypePair<Integer>(11, 12);
        SameTypePair<Integer> integerSameTypePair = new SameTypePair<>(11, 12);


        ArrayList list1 = new ArrayList();
        list1.add("String");
        list1.add(10);
        list1.add(integerIntegerSimplePair);

        String getElem = (String) list1.get(0);
//        String getElem2 = (String) list1.get(1); // runtime error

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("String");
//        list4.add(10); compile-time error
//        list4.add(integerIntegerSimplePair); compile-time error


        List colectie = new ArrayList();
        colectie.add(Math.random() > 0.5 ? 10 : "test");
//        ???getElem3 = colectie.get(0);


        Number num1 = Integer.valueOf(100);
//        List<Number> numbers = new ArrayList<Integer>(); polimorfismul nu functioneaza in interiorul <>

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        List<String> strings = Arrays.asList("unu","doi","trei");
        print2(integerList);
//        print2(strings);


        List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
        List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number
        Number firstElement = foo3.get(0);
//        foo5.add(Double.MAX_VALUE);

        List<? super Integer> foo10 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo11 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> foo12 = new ArrayList<Object>();   // Object is a superclass of Integer
        foo12.add(12);

        //        PECS
//        Remember PECS: "Producer Extends, Consumer Super".
//        "Producer Extends" - If you need a
//        List to produce T values (you want to read Ts from the list), you need to declare
//        it with ? extends T, e.g. List<? extends Integer>. But you cannot add to this list.
//
//        "Consumer Super" - If you need a List
//        to consume T values (you want to write Ts into the list),
//        you need to declare it with ? super T, e.g. List<? super Integer>. But there are
//        no guaranteesdsrfdsfdsghdfhdasfsgfdsgds what type of object you may read from this list.
//        If you need to both read from and write to a list, you need to declare it exactly with no wildcards, e.g. List<Integer>.

//        Example:
//        public class Collections {
//                                              consumer                    producer
//            public static <T> void copy(List<? super T> dest, List<? extends T> src) {
//                for (int i = 0; i < src.size(); i++)
//                    dest.set(i, src.get(i));
//                    src.set(i, dest.get(i)); asta nu va merge pt ca in acest caz nu stiu ce elemente(tip) am in dest
//            }
//        }




    }

    public static void print(List<?> list){
        Object c = "test";
        for (Object elem: list){
            System.out.println(elem.toString());
        }
    }


    public static void print2(List<? extends Number> list){
//        list.add("dsada");
        for (Object elem: list){
            System.out.println(elem.toString());
        }
    }
}
