package bitcamp.lms;
import java.util.Scanner;
import java.sql.Date;

public class App {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int i = 10;
    int[] no = new int[i];
    String[] cl = new String[i];
    String[] re = new String[i];
    Date[] st = new Date[i];
    Date[] ot = new Date[i];
    int[] am = new int[i];
    int[] tt = new int[i];

    int j = 0;
    while (j < 10) {
      System.out.print("번호: ");
      no[j] = kb.nextInt();
      kb.nextLine();
      System.out.print("수업명: ");
      cl[j] = kb.nextLine();
      System.out.print("수업내용: ");
      re[j] = kb.nextLine();
      System.out.print("시작일: ");
      st[j] = Date.valueOf(kb.nextLine());
      System.out.print("종료일: ");
      ot[j] = Date.valueOf(kb.nextLine());
      System.out.print("총수업시간: ");
      am[j] = Integer.parseInt(kb.nextLine());
      System.out.print("일수업시간: ");
      tt[j] = Integer.parseInt(kb.nextLine());
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
    for(int n = 0 ; n<j ; n++) {
      System.out.printf("%s %s ~ %s %d\n",cl[n],st[n],ot[n],am[n]);
    }
  }
}
