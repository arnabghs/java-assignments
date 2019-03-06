package com.step.assignments;

public class BarkingDog {

  public static void main(String[] args) {
    System.out.println(shouldWakeUp(true,1));
  }
  public static boolean shouldWakeUp(boolean barking,int hourOfDay){
    return barking && (hourOfDay < 8 || hourOfDay > 22) && hourOfDay >= 0 && hourOfDay <= 23;
  }
}
