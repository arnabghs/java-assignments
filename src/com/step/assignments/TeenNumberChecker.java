package com.step.assignments;

public class TeenNumberChecker {
  public static void main(String[] args) {
    System.out.println(hasTeen(10,20,30));
  }
  public static boolean hasTeen(int a, int b, int c){
    return (isTeen(a) || isTeen(b) || isTeen(c));
  }

  public static boolean isTeen(int x){
    return (x>=13 && x<=19);
  }
}
