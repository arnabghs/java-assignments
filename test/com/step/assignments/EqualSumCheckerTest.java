package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {
  @Test
  void test1 (){
    boolean actual = EqualSumChecker.hasEqualSum(1, 1, 1);
    assertFalse(actual);
  }
  @Test
  void test2 (){
    boolean actual = EqualSumChecker.hasEqualSum(1, 1, 2);
    assertTrue(actual);
  }
  @Test
  void test3 (){
    boolean actual = EqualSumChecker.hasEqualSum(1, -1, 0);
    assertTrue(actual);
  }
}