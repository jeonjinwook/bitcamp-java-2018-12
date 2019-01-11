package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class MemberHandler {
  final static int LENGTH = 10;
  static Scanner kb = new Scanner(System.in);
  static Member[] members = new Member[LENGTH];
  static int msize = 0;
  static void addMember() {
    System.out.print("명령> member/add");
    System.out.println();
    Member s4 = new Member();
    System.out.print("번호: ");
    s4.num = kb.nextInt();
    kb.nextLine();
    System.out.print("이름: ");
    s4.name = kb.nextLine();
    System.out.print("이메일: ");
    s4.com = kb.nextLine();
    System.out.print("암호: ");
    s4.pa = kb.nextInt();
    kb.nextLine();
    System.out.print("사진: ");
    s4.pt = kb.nextLine();
    System.out.print("전화: ");
    s4.ca = kb.nextLine();
    System.out.print("가입일: ");
    s4.pu = Date.valueOf(kb.nextLine());
    s4.pl = new Date(System.currentTimeMillis());
    members[msize++] = s4;
    System.out.println("저장하였습니다.");
  }
  static void listMember() {
    System.out.print("명령> member/list");
    System.out.println();
    for(int t = 0 ;t < msize ; t++) {
      System.out.printf("%s , %s , %s ,%s %s\n"
          , members[t].name, members[t].com, members[t].pu, members[t].ca, members[t].pl);
    }
  }

}
