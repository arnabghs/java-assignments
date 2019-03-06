package com.step.assignments;

public class LeapYearCalculator {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2000));
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    }
    if (year % 100 == 0) {
      return year % 400 == 0;
    }
    return year % 4 == 0;
  }
}
