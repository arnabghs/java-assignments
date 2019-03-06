package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {
  @Test
  void test1(){
    boolean actual = LeapYearCalculator.isLeapYear(-1600);
    assertEquals(false,actual);
  }
  @Test
  void test2(){
    boolean actual = LeapYearCalculator.isLeapYear(1600);
    assertEquals(true,actual);
  }

  @Test
  void test3(){
    boolean actual = LeapYearCalculator.isLeapYear(2017);
    assertEquals(false,actual);
  }
  @Test
  void test4(){
    boolean actual = LeapYearCalculator.isLeapYear(2000);
    assertEquals(true,actual);
  }
}