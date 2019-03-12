package com.step.polymorphismExercise;

public class NonInteractiveWebPage extends WebPage{
  @Override
  public void display(String input) {
    super.display(input);
  }

  @Override
  public String getPrintContent() {
    return super.getPrintContent();
  }

  @Override
  public void click() {
    System.out.println("Doesn't support click");
  }
}
