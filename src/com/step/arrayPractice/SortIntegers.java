package com.step.arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {
  public static void main(String[] args) {
    int[] unorderedArray = getIntegers();
    int[] orderedArray = sortIntegers(unorderedArray);
    printArray(orderedArray);
  }

  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);

    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }

    return sortedArray;
  }


  private static void printArray(int[] arr) {
    for (int value : arr) {
      System.out.println(value);
    }
  }

  public static int[] getIntegers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter how many numbers you want to sort:");
    int count = scanner.nextInt();

    int[] unorderedArray = new int[count];

    System.out.println("Enter Numbers:");
    for (int i = 0; i < count; i++) {
      unorderedArray[i] = scanner.nextInt();
    }
    return unorderedArray;
  }
}

