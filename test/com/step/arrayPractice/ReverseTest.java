package com.step.arrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
  @Test
  void oddNumberOfInts() {
    int[] sampleArray = {1,2,3,4,5};
    Reverse.reverse(sampleArray);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1},sampleArray);
  }
  @Test
  void EvenNumberOfInts() {
    int[] sampleArray = {1,2,3,4,5,6};
    Reverse.reverse(sampleArray);
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1},sampleArray);
  }
}