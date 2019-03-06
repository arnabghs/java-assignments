package com.step.assignments;

public class MegaBytesConverter {

  public static void main(String[] args) {
    System.out.println(printMegaBytesAndKiloBytes(100));
  }

    public static String printMegaBytesAndKiloBytes(int kiloBytes) {
      if (kiloBytes < 0) {
        return ("Invalid Value");
      }
      int mb = kiloBytes / 1024;
      int kb = kiloBytes % 1024;
      return (kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
    }
  }
