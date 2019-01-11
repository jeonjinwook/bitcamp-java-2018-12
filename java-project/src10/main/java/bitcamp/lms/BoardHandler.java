package bitcamp.lms;

import java.sql.Date;
import java.util.Scanner;

public class BoardHandler {
  final static int LENGTH = 10;
  static Scanner kb = new Scanner(System.in);
  static Board[] boards = new Board[LENGTH];
  static int bsize = 0;
  static void addBoard() {
    System.out.print("명령> board/add");
    System.out.println();
    Board s6 = new Board();
    System.out.print("번호? ");
    s6.num = kb.nextInt();
    kb.nextLine();

    System.out.print("내용? ");
    s6.ti = kb.nextLine();

    s6.vi = 0;

    s6.pl = new Date(System.currentTimeMillis());
    System.out.println("저장하였습니다.");
    boards[bsize++] = s6;
    System.out.println();
  }
  static void listBoard() {
    System.out.println();
    System.out.print("명령> board/list");
    for(int m = 0 ; m < bsize ; m++ ) {
      System.out.printf("%d %s %s %d\n"
          , boards[m].num, boards[m].ti, boards[m].pl, boards[m].vi);
    }
  }

}
