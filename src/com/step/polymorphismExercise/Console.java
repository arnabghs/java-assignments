package com.step.polymorphismExercise;

public class Console implements Displayable {

  @Override
  public void display(String input) {
    System.out.println(input);
  }
}
