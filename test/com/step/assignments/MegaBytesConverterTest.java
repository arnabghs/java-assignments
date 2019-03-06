package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MegaBytesConverterTest {

  @Test
  void test1(){
    String actual = MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
    assertEquals("2500 KB = 2 MB and 452 KB", actual);
  }
  @Test
  void test2(){
    String actual = MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
    assertEquals("Invalid Value", actual);
  }
  @Test
  void test3(){
    String actual = MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    assertEquals("5000 KB = 4 MB and 904 KB", actual);
  }
}

