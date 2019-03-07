package com.step.assignments;

public class Cuboid extends Rectangle {
  private double height;

  public static void main(String[] args) {
    Cuboid cube = new Cuboid(10,10,10);
    System.out.println(cube.getVolume());
  }

  public Cuboid(double width, double length, double height) {
    super(width, length);
    this.height = height;
    if (height <0){
      this.height = 0;
    }
  }

  public double getHeight() {
    return height;
  }

  public double getVolume(){
    return height*super.getArea();
  }
}
