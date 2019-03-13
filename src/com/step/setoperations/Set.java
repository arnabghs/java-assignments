package com.step.setoperations;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
  public static void main(String[] args) {
//    HashSet<Integer> sample1 = new HashSet<>();
//    HashSet<Integer> sample2 = new HashSet<>();


    HashSet<Integer> sample1 = new HashSet<>(Arrays.asList(12, 34, 56, 21, 87));
    HashSet<Integer> sample2 = new HashSet<>(Arrays.asList(23, 87, 34, 67, 56));

//
//    sample1.add(2);
//    sample1.add(3);
//    sample1.add(4);
//    sample1.add(5);
//
//    sample2.add(4);
//    sample2.add(5);
//    sample2.add(6);
//    sample2.add(7);

    System.out.println(union(sample1, sample2));
    System.out.println(intersection(sample1, sample2));
    System.out.println(difference(sample1, sample2));
  }

  public static <T> HashSet<T> union(HashSet<T> firstSet, HashSet<T> secondSet) {
    HashSet<T> result = new HashSet<>(firstSet);
    result.addAll(secondSet);
    return result;
  }

  public static <T> HashSet<T> intersection(HashSet<T> firstSet, HashSet<T> secondSet) {
    HashSet<T> result = new HashSet<>(firstSet);
    result.retainAll(secondSet);
    return result;
  }

  public static <T> HashSet<T> difference(HashSet<T> firstSet, HashSet<T> secondSet) {
    HashSet<T> result = new HashSet<>(firstSet);
    result.removeAll(secondSet);
    return result;
  }
}