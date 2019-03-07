package com.step.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintJobTest {
  @Test
  @DisplayName("Invalid width")
  void getBucketCount (){
    int actualCount = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
    assertEquals(-1,actualCount);
  }
  @Test
  @DisplayName("All valid inputs")
  void getBucketCount2 (){
    int actualCount = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
    assertEquals(3,actualCount);
  }
  @Test
  @DisplayName("All valid inputs")
  void getBucketCount3 (){
    int actualCount = PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);
    assertEquals(3,actualCount);
  }
  @Test
  @DisplayName("Without ExtraBucket and invalid width")
  void getBucketCount4 (){
    int actualCount = PaintJob.getBucketCount(-3.4, 2.1, 1.5);
    assertEquals(-1,actualCount);
  }
  @Test
  @DisplayName("Without ExtraBucket and valid inputs")
  void getBucketCount5 (){
    int actualCount = PaintJob.getBucketCount(3.4, 2.1, 1.5);
    assertEquals(5,actualCount);
  }
  @Test
  @DisplayName("Without ExtraBucket and valid inputs")
  void getBucketCount6 (){
    int actualCount = PaintJob.getBucketCount(7.25, 4.3, 2.35);
    assertEquals(14,actualCount);
  }
  @Test
  @DisplayName("With valid area & areaPerBucket")
  void getBucketCount7 (){
    int actualCount = PaintJob.getBucketCount(3.4, 1.5);
    assertEquals(3,actualCount);
  }
  @Test
  @DisplayName("With Invalid area & areaPerBucket")
  void getBucketCount8 (){
    int actualCount = PaintJob.getBucketCount(3.4, -1.5);
    assertEquals(-1,actualCount);
  }
}
