package com.step.polymorphismExercise;

public class PDFPage implements Printable,Displayable {
  @Override
  public void display(String input) {
    System.out.println("print webpage");
  }

  @Override
  public String getPrintContent() {
    return "From webpage";
  }
}
