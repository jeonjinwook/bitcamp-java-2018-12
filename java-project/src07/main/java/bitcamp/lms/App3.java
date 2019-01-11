package bitcamp.lms;
import java.util.Scanner;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int i = 10; 
    Board[] s1 = new Board[i];
    Board s2 = new Board();
    int j = 0;
    while(j < 10){
      System.out.print("번호? ");
      s2.num = kb.nextInt();
      kb.nextLine();
      
      System.out.print("내용? ");
      s2.ti = kb.nextLine();
      
      s2.vi = 0;
      
      s2.pl = new Date(System.currentTimeMillis());
      s1[j] = s2;
      j++;
      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n)");
      String li = kb.nextLine();
      
      if(!li.equalsIgnoreCase("y") && !li.equalsIgnoreCase("")){
        break;
      }
      System.out.println();
    }
    kb.close();
    
    for(int m = 0 ; m < j ; m++ ) {
      System.out.printf("%d %s %s %d\n"
          , s1[m].num, s1[m].ti, s1[m].pl, s1[m].vi);
    }
  }
}
