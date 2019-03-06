package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {
  @Test
  void test1(){
    boolean actual = BarkingDog.shouldWakeUp(true, 1);
    assertEquals(true,actual);
  }
  @Test
  void test2(){
    boolean actual = BarkingDog.shouldWakeUp(false, 2);
    assertEquals(false,actual);
  }

  @Test
  void test3(){
    boolean actual = BarkingDog.shouldWakeUp(true, 8);
    assertEquals(false,actual);
  }

  @Test
  void test4(){
    boolean actual = BarkingDog.shouldWakeUp(true, -1);
    assertEquals(false,actual);
  }
}