package com.step.experiment;


public class JewelryBox {
  private Jewelry jewelry;
  private JewelryBox box;
  private int jewelryCount = 0;

  public JewelryBox(Jewelry jewelry, JewelryBox box) {
    this.jewelry = jewelry;
    this.box = box;
    if(jewelry != null) {
      this.jewelryCount += 1;
    }
//    if(box != null) {
      this.jewelryCount += box.getJewelryCount();
//    }
  }

  public JewelryBox(){
  }

  public JewelryBox(Jewelry jewelry) {
    this(jewelry, new JewelryBox());
  }

  public JewelryBox(JewelryBox box) {
    this(null, box);
  }

  public int getJewelryCount(){
    return this.jewelryCount;
  }
}
