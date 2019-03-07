package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToYearsDaysCalculatorTest {
  @Test
  void test1(){
    String actual = MinutesToYearsDaysCalculator.printYearsAndDays(525600);
    assertEquals("525600 min = 1 y and 0 d",actual);
  }
  @Test
  void test2(){
    String actual = MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
    assertEquals("1051200 min = 2 y and 0 d",actual);
  }
  @Test
  void test3(){
    String actual = MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    assertEquals("561600 min = 1 y and 25 d",actual);
  }
}