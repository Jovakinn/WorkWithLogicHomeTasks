package com.homework.service;

public class LogicSumming {

    // we will working in area 5 numbers input data
    public void mathSumming(int bigNum){

        // calculation of each part of our number
        int bigNum1 = bigNum % 10;
        int bigNum2 = (bigNum / 10) % 10;
        int bigNum3 = (bigNum / 100) % 10;
        int bigNum4 = (bigNum / 1000) % 10;
        int bigNum5 = (bigNum / 10000) % 10;

        // output data
        int result = bigNum1 + bigNum2 + bigNum3 + bigNum4 + bigNum5;
        System.out.println("Result math summing: " + result);
    }


}
