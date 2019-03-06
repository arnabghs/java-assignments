package com.step.assignments;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.step.assignments.SpeedConverter.printConversion;
import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void test1(){
    String actualOutput = SpeedConverter.printConversion(1.5);
    assertEquals("1.5 km/h = 1 mi/h", actualOutput);
  }

  @Test
  void test2(){
    String actualOutput = SpeedConverter.printConversion(10.25);
    assertEquals("10.25 km/h = 6 mi/h", actualOutput);
  }

  @Test
  void test3(){
    String actualOutput = SpeedConverter.printConversion(-5.6);
    assertEquals("Invalid Value", actualOutput);
  }

  @Test
  void test4(){
    String actualOutput = SpeedConverter.printConversion(25.42);
    assertEquals("25.42 km/h = 16 mi/h", actualOutput);
  }
  @Test
  void test5(){
    String actualOutput = SpeedConverter.printConversion(75.114);
    assertEquals("75.114 km/h = 47 mi/h", actualOutput);
  }
}