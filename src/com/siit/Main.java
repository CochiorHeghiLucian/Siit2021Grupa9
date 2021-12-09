package com.siit;

import com.siit.ex1.Box;
import com.siit.ex1.Pair;
import com.siit.ex1.SameTypePair;
import com.siit.ex1.SimplePair;

import java.util.ArrayList;
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
    }
}
