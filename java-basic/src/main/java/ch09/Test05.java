package ch09;

public class Test05 {
  
  public static void main(String[] args) {
    Calculator3 c1 = new Calculator3();
    Calculator3 c2 = new Calculator3();
    
    Calculator3.plus(c1, 2);
    Calculator3.plus(c2, 6);
    
    Calculator3.multiple(c1, 3);
    Calculator3.divide(c2, 2);
    
    Calculator3.minus(c1, 2);
    Calculator3.plus(c2, 9);
    
    Calculator3.plus(c1, 7);
    System.out.println(c1.result);
    System.out.println(c2.result);
  }
}