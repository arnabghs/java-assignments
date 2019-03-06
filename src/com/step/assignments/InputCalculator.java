package com.step.assignments;

import java.util.Scanner;

public class InputCalculator {
  public static void main(String[] args) {
    System.out.println(inputThenPrintSumAndAverage());
  }
  public static String inputThenPrintSumAndAverage() {
    double sum = 0;
    int count = 0;
    long avg = 0;
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
      sum += scanner.nextInt();
      count += 1;
      avg = Math.round(sum/count);
    }
    return "SUM = " + (int)sum + " AVG = " + avg;
  }
}
