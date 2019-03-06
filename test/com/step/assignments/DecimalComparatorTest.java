package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {
  @Test
  void test1() {
    boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    assertTrue(actual);
  }

  @Test
  void test2() {
    boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
    assertFalse(actual);
  }

  @Test
  void test3() {
    boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
    assertTrue(actual);
  }

  @Test
  void test4() {
    boolean actual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
    assertFalse(actual);
  }
}
