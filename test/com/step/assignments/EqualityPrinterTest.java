package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualityPrinterTest {
  @Test
  void test1(){
    String actual = EqualityPrinter.printEqual(1, 1, 1);
    assertEquals("All numbers are equal",actual);
  }
  @Test
  void test2(){
    String actual = EqualityPrinter.printEqual(1, 1, 2);
    assertEquals("Neither all are equal or different",actual);
  }
  @Test
  void test3(){
    String actual = EqualityPrinter.printEqual(-1, -1, -1);
    assertEquals("Invalid Value",actual);
  }
  @Test
  void test4(){
    String actual = EqualityPrinter.printEqual(1, 2, 3);
    assertEquals("All numbers are different",actual);
  }
}