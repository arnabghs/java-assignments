package com.step.polymorphismExercise;

public class WebPage implements Printable,Displayable {


  @Override
  public void display(String input) {

  }

  @Override
  public String getPrintContent() {
    return null;
  }

  public void click(){
    System.out.println("Clicked");
  }
}
