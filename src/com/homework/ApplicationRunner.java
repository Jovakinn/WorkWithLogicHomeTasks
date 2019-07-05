package com.homework;

import com.homework.service.LogicSumming;
import com.homework.service.NoMathLogicSumming;

public class ApplicationRunner {
    public static void main(String[] args) {
      LogicSumming logicSumming = new LogicSumming();
      logicSumming.mathSumming(12345);

      System.out.println();

      NoMathLogicSumming noMathLogicSumming = new NoMathLogicSumming();
      noMathLogicSumming.noMathSumming(12345);

    }
}
