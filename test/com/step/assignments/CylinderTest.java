package com.step.assignments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

  @Test
  void test1(){
    double actualArea = new Cylinder(5.55, 7.25).getArea();
    assertEquals(96.76890771219959,actualArea);
  }
  @Test
  void test2(){
    double actualVolume = new Cylinder(5.55, 7.25).getVolume();
    assertEquals(701.574580913447,actualVolume);
  }
}