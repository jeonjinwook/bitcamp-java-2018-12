package ch03;

public class Test09 {
  public static void main(String[] args) {
   java.util.Scanner keyboard = new java.util.Scanner(System.in);
   
   System.out.print("나이? ");
   int age = keyboard.nextInt();
   keyboard.nextLine();

   System.out.print("이름? ");
   String name  = keyboard.nextLine();

   // 사용자가 입력한 문자열을 출력한다
   System.out.printf("%d(%s)\n", age, name);
  }
}