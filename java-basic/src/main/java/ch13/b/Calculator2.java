package ch13.b;

import ch13.Calculator;

public class Calculator2 extends Calculator{

  public void multiple(int value) {
    this.result *= value;
  }
  
  public void divide(int value) {
    this.result /= value;
  }
}
