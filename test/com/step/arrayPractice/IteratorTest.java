package com.step.arrayPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import com.step.arrayPractice.Iterator;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    @DisplayName("should return true when there is next element")
    void hasNext () {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      Iterator iterator = new Iterator(list);
      assertTrue(iterator.hasNext());
    }

    @Test
    @DisplayName("should return false when there is next element")
    void hasNext1 () {
      ArrayList<Integer> list = new ArrayList<Integer>();
      Iterator iterator = new Iterator(list);
      assertFalse(iterator.hasNext());
    }

    @Test
    @DisplayName("should return the integer when there is next element")
    void next () {
      ArrayList<Integer> list = new ArrayList<Integer>();
      Integer integer = 1;
      list.add(integer);
      Iterator iterator = new Iterator(list);
      assertEquals(integer, iterator.next());
    }

  @Test
  @DisplayName("should throw a NoSuchElementException")
  void next1() {
    ArrayList<Integer> list = new ArrayList<>();
    Iterator iterator = new Iterator(list);
    assertThrows(NoSuchElementException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        iterator.next();
      }
    });
  }
  }