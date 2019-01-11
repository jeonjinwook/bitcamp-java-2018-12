package bitcamp.lms;
import java.util.Scanner;
import ch08.Board;
import ch08.Lesson;
import ch08.Member;
import java.sql.Date;
public class App {
  public static void main(String[] args) {
    public static void main(String[] args) {
      final int i = 10;
      int size1 = 10;
      int size2 = 10;
      Scanner kb = new Scanner(System.in);
      Lesson[] s1 = new Lesson[i];
      Member[] s3 = new Member[size1];
      Board[] s5 = new Board[size2];
      int size = 0;
      int bsize = 0;
      int msize = 0;
      while (size < 10) {
        System.out.print("명령> ");
        String cmd = kb.nextLine();
        if(cmd.equalsIgnoreCase("/lesson/add")) {
          System.out.print("명령> /lesson/add");
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
          s1[size++] = s2;
        }else if(cmd.equalsIgnoreCase("/lesson/list")){
          System.out.print("명령> /lesson/list");
          System.out.println();
          for(int n = 0 ; n < size ; n++) {
            System.out.printf("%d, %s ,%s~%s ,%d\n",s1[n].no ,s1[n].cl,s1[n].st,s1[n].ot,s1[n].am);
          }
        }else if(cmd.equalsIgnoreCase("member/add")) {
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
            s3[msize++] = s4;
            System.out.println("저장하였습니다.");
        }else if(cmd.equalsIgnoreCase("member/list")) {
          for(int t = 0 ;t < msize ; t++) {
            System.out.printf("%s , %s , %s ,%s %s\n"
                , s3[t].name, s3[t].com, s3[t].pu, s3[t].ca, s3[t].pl);
          }
        }else if(cmd.equalsIgnoreCase("board/add")) {
          Board s6 = new Board();
          System.out.print("번호? ");
          s6.num = kb.nextInt();
          kb.nextLine();
          
          System.out.print("내용? ");
          s6.ti = kb.nextLine();
          
          s6.vi = 0;
          
          s6.pl = new Date(System.currentTimeMillis());
          System.out.println("저장하였습니다.");
          s5[bsize++] = s6;
          System.out.println();
        }else if(cmd.equalsIgnoreCase("board/list")) {
          for(int m = 0 ; m < bsize ; m++ ) {
            System.out.printf("%d %s %s %d\n"
                , s5[m].num, s5[m].ti, s5[m].pl, s5[m].vi);
          }
        }else if(cmd.equalsIgnoreCase("board/view")){
          System.out.print("명령> /board/view");
          System.out.println("실행할 수 없는 명령입니다.");
        }else if(cmd.equalsIgnoreCase("quit")){
          System.out.print("명령> quit");
          System.out.println();
          System.out.println("안녕");
          kb.close();
          break;
      }

    }

  }
}
