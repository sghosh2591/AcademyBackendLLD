package com.example.demo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TestWildCard {

    public void checkWildcard(){
        // Unbounded
        List<?> listUnbounded = new ArrayList<>();
        //listUnbounded.add(23); // Not allowed to read or write
        listUnbounded.add(null); // Just adding null allowed

        //upper bounded // writing restricted // reading allowed
        List<? extends Number> listUpperBounded = new ArrayList<Integer>();
        listUpperBounded.add(null);
        listUpperBounded.get(0); //
        System.out.println("Unbounded: " + listUnbounded.get(0));

        //lower bound // Writing allowed and reading allowed
        List<? super Integer> listLowerBound = new ArrayList<Number>();
//        listLowerBound.add(null);
        listLowerBound.add(34);
        listLowerBound.get(0);
        System.out.println("LowerBound: " + listLowerBound.get(0));
    }
}
