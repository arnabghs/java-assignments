package com.step.arrayPractice;

import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    int[] sampleArray = {1,2,3,4,5};
    System.out.println(Arrays.toString(sampleArray));
    reverse(sampleArray);
    System.out.println(Arrays.toString(sampleArray));
  }

  public static void reverse (int[] array){
    int halfLength = array.length /2;
    for (int i = 0; i < halfLength; i++) {
      int temp = array[i];
      array[i] = array[array.length-1-i];
      array[array.length-1-i] = temp;
    }
  }
}
