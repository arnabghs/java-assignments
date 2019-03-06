package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {
  @Test
  void test1() {
    boolean actual = TeenNumberChecker.hasTeen(9,99, 19);
    assertTrue(actual);
  }
  @Test
  void test2() {
    boolean actual = TeenNumberChecker.hasTeen(23, 15, 42);
    assertTrue(actual);
  }
  @Test
  void test3() {
    boolean actual = TeenNumberChecker.hasTeen(22, 23, 34);
    assertFalse(actual);
  }

}