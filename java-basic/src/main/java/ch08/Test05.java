package ch08;

public class Test05 {
  static int a;
  public static void main(String[] args) {
    a = 100;
    m1();
    m2();
    System.out.println(a);
  }
  static void m1() {
    a = 200;
  }
  static void m2() {
    a = 300;
  }
}