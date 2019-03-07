package com.step.assignments;

public class PlayingCat {
  public static void main(String[] args) {
    System.out.println(isCatPlaying(true, 30));
  }

  public static boolean isCatPlaying(boolean summer,int temperature) {
    if (!summer) {
      return (temperature >= 25 && temperature <= 35);
    }
    return (temperature >= 25 && temperature <= 45);
  }
}
