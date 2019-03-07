package com.step.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {
  @Test
  @DisplayName("Circle")
  void test1 (){
    double actual = AreaCalculator.area(5.0);
    actual = Math.floor(actual*1000)/1000;
    assertEquals(78.539, actual);
  }
  @Test
  @DisplayName("Invalid radius")
  void test2 (){
    double actual = AreaCalculator.area(-1);
    assertEquals(-1, actual);
  }
  @Test
  @DisplayName("Rectangle")
  void test3 (){
    double actual = AreaCalculator.area(5.0,4.0);
    assertEquals(20, actual);
  }
  @Test
  @DisplayName("Invalid side")
  void test4 (){
    double actual = AreaCalculator.area(-1.0,4.0);
    assertEquals(-1, actual);
  }
}