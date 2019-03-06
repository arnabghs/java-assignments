package com.step.assignments;

public class MinutesAndSeconds {
  private static final String ERROR_MESSAGE = "Invalid value";

  public static void main(String[] args) {
    System.out.println(getDurationString(100));
    System.out.println(getDurationString(100, 100));
  }

  public static String getDurationString(int minutes, int seconds) {
    if (minutes < 0) {
      return ERROR_MESSAGE;
    }
    if (seconds < 0 || seconds > 59) {
      return ERROR_MESSAGE;
    }

    int hour = minutes / 60;
    int min = (minutes % 60);
    return hour + "h " + min + "m " + seconds + "s";
  }

  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return ERROR_MESSAGE;
    }
    int min = seconds / 60;
    int sec = (seconds % 60);
    return getDurationString(min, sec);
  }
}
