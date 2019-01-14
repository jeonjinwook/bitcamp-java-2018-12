package ch09;

public class Calculator3 {

  int result = 0;

  static void plus(Calculator3 that, int a) {
    that.result += a;
    //result += a;
  }

  static void minus(Calculator3 that, int a) {
    that.result -= a;
    //result -= a; 
  }

  static void multiple(Calculator3 that, int a) {
    that.result *= a;
    //result *= a; 
  }

  static void divide(Calculator3 that, int a) {
    that.result /= a;
    //result /= a; 
  }
}
