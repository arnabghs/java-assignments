package com.step.arrayPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Iterator {

//  public static void main(String[] args) {
//    List<Integer> list = new ArrayList<>();
//    list.add(3);
//    list.add(4);
//    list.add(5);
//    list.add(6);
//    list.add(7);
//    list.add(8);
//    Iterator iterator = new Iterator(list);
//
//    System.out.println(iterator.hasNext());
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//    System.out.println(iterator.hasNext());
//  }

  private int lastAccessedIndex;
  private List list;

  public Iterator(List list) {
    this.list = list;
    this.lastAccessedIndex = -1;
  }

  public boolean hasNext() {
    return (this.list.size() - lastAccessedIndex > 1);
  }

  public Integer next() {
    if (hasNext()) {
      int value = (int) this.list.get(lastAccessedIndex + 1);
      this.lastAccessedIndex++;
      return value;
    }
    throw new NoSuchElementException();
  }
}
