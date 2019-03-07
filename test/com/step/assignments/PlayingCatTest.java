package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {
  @Test
  void test1 (){
    boolean actual = PlayingCat.isCatPlaying(true, 10);
    assertFalse(actual);
  }
  @Test
  void test2 (){
    boolean actual = PlayingCat.isCatPlaying(false, 36);
    assertFalse(actual);
  }
  @Test
  void test3 (){
    boolean actual = PlayingCat.isCatPlaying(false, 35);
    assertTrue(actual);
  }
}