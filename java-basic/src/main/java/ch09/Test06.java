package ch09;

public class Test06 {
  
  public static void main(String[] args) {
    Calculator4 c1 = new Calculator4();
    Calculator4 c2 = new Calculator4();
    
    c1.plus(2);
    c2.plus(6);
    
    c1.multiple(3);
    c2.divide(2);
    
    c1.minus(2);
    c2.plus(9);
    
    c1.plus(7);
    System.out.println(c1.result);
    System.out.println(c2.result);
//    Calculator4 c3 = null;
//    c3.plus(3);
      }
}