package bitcamp.lms;

import java.util.*;
import java.sql.Date;
import bitcamp.lms.*;
public class App2 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int i = 10;
    Member[] s1 = new Member[i];

    int j = 0;
    while(j < 10){
      Member s2 = new Member();
      System.out.print("번호: ");
      s2.num = kb.nextInt();
      kb.nextLine();
      System.out.print("이름: ");
      s2.name = kb.nextLine();
      System.out.print("이메일: ");
      s2.com = kb.nextLine();
      System.out.print("암호: ");
      s2.pa = kb.nextInt();
      kb.nextLine();
      System.out.print("사진: ");
      s2.pt = kb.nextLine();
      System.out.print("전화: ");
      s2.ca = kb.nextLine();
      System.out.print("가입일: ");
      s2.pu = Date.valueOf(kb.nextLine());
      s2.pl = new Date(System.currentTimeMillis());
      s1[j] = s2;
      j++;
      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String li = kb.nextLine();
      if(!li.equalsIgnoreCase("y") && !li.equalsIgnoreCase("")) {
        break;
      }
      System.out.println();
    }
    kb.close();
    System.out.println();
    for(int m = 0 ;m < j ; m++) {
      System.out.printf("%s , %s , %s ,%s %s\n"
          , s1[m].name, s1[m].com, s1[m].pu, s1[m].ca, s1[m].pl);
    }
  }
}
