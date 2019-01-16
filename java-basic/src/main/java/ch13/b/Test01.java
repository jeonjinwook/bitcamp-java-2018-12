package ch13.b;

public class Test01 {
  public static void main(String[] args) {
    Calculator2 c1 = new Calculator2();
    c1.plus(5);
    c1.multiple(2);
    c1.minus(2);
    c1.divide(4);
    System.out.println(c1.getResult());
  }
}
