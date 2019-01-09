package bitcamp.lms;

import java.util.*;
import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int i = 10;
    int[] num = new int[i];
    String[] name = new String[i];
    String[] com = new String[i];
    int[] pa = new int[i];
    String[] pt = new String[i];
    String[] ca = new String[i];
    Date[] pu = new Date[i];
    Date[] pl = new Date[i];

    int j = 0;
    while(j < 10){
      System.out.print("번호: ");
      num[j] = kb.nextInt();
      kb.nextLine();
      System.out.print("이름: ");
      name[j] = kb.nextLine();
      System.out.print("이메일: ");
      com[j] = kb.nextLine();
      System.out.print("암호: ");
      pa[j] = kb.nextInt();
      kb.nextLine();
      System.out.print("사진: ");
      pt[j] = kb.nextLine();
      System.out.print("전화: ");
      ca[j] = kb.nextLine();
      System.out.print("가입일: ");
      pu[j] = Date.valueOf(kb.nextLine());
      pl[j] = new Date(System.currentTimeMillis());
      j++;
      System.out.println("계속 입력하시겠습니까?(Y/n)");
      String li = kb.nextLine();
      if(!li.equalsIgnoreCase("y") && !li.equalsIgnoreCase("")) {
        break;
      }
      System.out.println();
    }
    kb.close();
    System.out.println();
    for(int m = 0 ;m < j ; m++) {
      System.out.printf("%s , %s , %s ,%s %d\n",name[m],com[m],pu[m], ca[m],pl[m]);
    }
  }
}
