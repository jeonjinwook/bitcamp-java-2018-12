package ch07;

public class Test02 {
  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100;
    int eng = 100;
    int math = 100;
    printScore(name,kor,eng,math);
  }
  static void printScore(String name, int kor, int eng, int math) {
    int sum = kor + eng + math;
    float aver = sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %.1f", name, kor, eng, math, sum, aver);

  }
}