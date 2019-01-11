package bitcamp.lms;
import java.util.Scanner;
import java.sql.Date;
public class App {
  static final int i = 10;
  static Scanner kb = new Scanner(System.in);
  static Lesson[] lessons = new Lesson[i];
  static int size = 0;
  static Member[] members = new Member[i];
  static int msize = 0;
  static Board[] boards = new Board[i];
  static int bsize = 0;
  public static void main(String[] args) {
    while (size < 10) {
      String cmd = prompt();
      if(cmd.equalsIgnoreCase("lesson/add")) {
        addLesson();
      }else if(cmd.equalsIgnoreCase("lesson/list")){
        listLesson();
      }else if(cmd.equalsIgnoreCase("member/add")) {
        addMember();
      }else if(cmd.equalsIgnoreCase("member/list")) {
        listMember();
      }else if(cmd.equalsIgnoreCase("board/add")) {
        addBoard();
      }else if(cmd.equalsIgnoreCase("board/list")) {
        listBoard();
      }else if(cmd.equalsIgnoreCase("quit")){
        end();
        break;
      }else{
      }

    }

  }
  static void addLesson() {
    System.out.print("명령> lesson/add");
    System.out.println();
    Lesson s2 = new Lesson();
    System.out.print("번호: ");
    s2.no = kb.nextInt();
    kb.nextLine();
    System.out.print("수업명: ");
    s2.cl = kb.nextLine();
    System.out.print("수업내용: ");
    s2.re = kb.nextLine();
    s2.st = new Date(System.currentTimeMillis());
    System.out.print("시작일: " + s2.st);
    System.out.println();
    System.out.print("종료일: ");
    s2.ot = Date.valueOf(kb.nextLine());
    System.out.print("총수업시간: ");
    s2.am = Integer.parseInt(kb.nextLine());
    System.out.print("일수업시간: ");
    s2.tt= Integer.parseInt(kb.nextLine());
    System.out.println("저장하였습니다.");
    lessons[size++] = s2;
  }
  static void listLesson() {
    System.out.print("명령> lesson/list");
    System.out.println();
    for(int n = 0 ; n < size ; n++) {
      System.out.printf("%d, %s ,%s~%s ,%d\n",lessons[n].no ,lessons[n].cl,lessons[n].st,lessons[n].ot,lessons[n].am);
    }

  }
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
  static void promp(){
    System.out.print("!error!");
    System.out.println("다시 입력해주세요");
  }
  static void end() {
    System.out.print("명령> quit");
    System.out.println();
    System.out.println("안녕");
  }
  static String prompt() {
    System.out.print("명령> ");
    String cmd = kb.nextLine();
    return cmd;
  }
}
