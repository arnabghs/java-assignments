package com.step.assignments;

public class MinutesToYearsDaysCalculator {
  public static void main(String[] args) {
    System.out.println(printYearsAndDays(10000));
  }
  public static String printYearsAndDays (long minutes){
    if (minutes < 0){
      return "Invalid Value";
    }

    int hours = (int)(minutes/60L);
    int days = (hours/24);
    int years = (days/365);
    int remainingDays = (days%365);

    return minutes + " min = " + years + " y and " + remainingDays + " d";
  }

}
