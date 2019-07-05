package com.homework.service;

import java.util.Arrays;

public class NoMathLogicSumming {
    public void change(int bigNumNoMath){
        noMathSumming(String.valueOf(bigNumNoMath));
    }

    public void noMathSumming(String bigNumNoMath){
        String stringNew = bigNumNoMath;
        // create chars array
        char[] massiveChar = stringNew.toCharArray();

        // create int array from existing char array
        int[] massiveInt = new String(massiveChar).chars().toArray();
        int sum = Arrays.stream(massiveInt).sum();

        // output sum
        System.out.println("Result no math summing " + sum);

    }
}