package ch02;

public class Test07 {
  public static void main(String[] args) {
    // '가' 문자를 출력하라
    System.out.println(0xac00);
    System.out.println((char)0xac00);
    System.out.println('가');
    System.out.println('가' + 2);
    System.out.println((char)('가' + 2));
    System.out.println('\uac00');
    System.out.println('\u32d4');
  }
}