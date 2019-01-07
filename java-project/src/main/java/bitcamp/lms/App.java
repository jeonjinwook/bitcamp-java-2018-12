package bitcamp.lms;

public class App {
 public static void main(String[] args) {
   java.util.Scanner kb = new java.util.Scanner(System.in);
   java.util.Date today = new java.util.Date();
     System.out.print("번호: ");
     int num = kb.nextInt();
     kb.nextLine();
     System.out.println("수업명: ");
     String java = kb.nextLine();
     System.out.println("설명: ");
     String sp = kb.nextLine();
     System.out.println("시작일: ");
     String st = kb.nextLine();
     System.out.println("종료일: ");
     String ou = kb.nextLine();
     System.out.println("총수업시간: ");
     String ti = kb.nextLine();
     System.out.println("일수업시간: ");
     String day = kb.nextLine();
     kb.close();
     
     System.out.printf(" 번호: %d\n 수업명: %s\n 설명: %s\n 시작일: %s\n "
         + "종료일: %s\n 총수업시간: %s\n 일수업시간: %s" 
         ,num,java,sp,st,ou,ti,day);
    }
}
