package bitcamp.lms;
import java.util.Scanner;
import java.sql.Date;
import bitcamp.lms.*;
public class App {
  public static void main(String[] args) {
    int i = 10;
    Scanner kb = new Scanner(System.in);
     Lesson[] s1 = new Lesson[i];
    int j = 0;
    while (j < 10) {
      Lesson s2 = new Lesson();
      System.out.print("번호: ");
      s2.no = kb.nextInt();
      kb.nextLine();
      System.out.print("수업명: ");
      s2.cl = kb.nextLine();
      System.out.print("수업내용: ");
      s2.re = kb.nextLine();
      System.out.print("시작일: ");
      s2.st = Date.valueOf(kb.nextLine());
      System.out.print("종료일: ");
      s2.ot = Date.valueOf(kb.nextLine());
      System.out.print("총수업시간: ");
      s2.am = Integer.parseInt(kb.nextLine());
      System.out.print("일수업시간: ");
      s2.tt= Integer.parseInt(kb.nextLine());
      s1[j] = s2;
      j++;
      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String li = kb.nextLine();
      if (!li.equalsIgnoreCase("y") && !li.equalsIgnoreCase("")) {
        break;
      }
      System.out.println();
    }
    kb.close();
    System.out.println();
    for(int n = 0 ; n < j ; n++) {
      System.out.printf("%s ,%s~%s ,%d\n",s1[n].cl,s1[n].st,s1[n].ot,s1[n].am);
    }
  }
}
