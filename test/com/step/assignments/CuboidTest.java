package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {
  @Test
  void rectangleAreaTest(){
    double actualArea = new Rectangle(5,10).getArea();
    assertEquals(50,actualArea);
  }
  @Test
  void cuboidAreaTest(){
    double actualArea = new Cuboid(5,10,5).getArea();
    assertEquals(50,actualArea);
  }
  @Test
  void cuboidVolumeTest(){
    double actualVolume = new Cuboid(5,10,5).getVolume();
    assertEquals(250.0,actualVolume);
  }
}