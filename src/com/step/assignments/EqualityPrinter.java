package com.step.assignments;

public class EqualityPrinter {
  public static void main(String[] args) {
    System.out.println(printEqual(10, 10, 20));
  }

  public static String printEqual(int a, int b, int c) {
    if (a < 0 || b < 0 || c < 0) {
      return "Invalid Value";
    }
    if (a == b && b == c) {
      return "All numbers are equal";
    }
    if (a == b || b == c || a == c) {
      return "Neither all are equal or different";
    }
    return "All numbers are different";
  }
}
