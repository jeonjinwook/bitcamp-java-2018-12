package ch03;

public class Test07 {
  public static void main(String[] args) {
   java.util.Scanner keyboard = new java.util.Scanner(System.in);
   
   System.out.println("이름을 입력하세요:");
   java.lang.String name = keyboard.nextLine();

   System.out.println("나이를 입력하세요:");
   String age = keyboard.nextLine(); // java.lang 패키지의 멤버를 사용할 때는
   // 패키지 이름을 적지 않아도 된다.

   // 사용자가 입력한 문자열을 출력한다
   System.out.printf("%s(%s)\n", name,age);
  }
}