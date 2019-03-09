package com.step.JewelryBox;

public class Main {

  public static void main(String[] args) {
    Jewelry ring = new Jewelry("Ring");
    Jewelry necklace = new Jewelry("Necklace");
    Jewelry tiara = new Jewelry("Tiara");

    JewelryBox box2 = new JewelryBox(necklace);
    JewelryBox box1 = new JewelryBox(ring, box2);

    System.out.println(box1.getJewelryCount());
  }
}
