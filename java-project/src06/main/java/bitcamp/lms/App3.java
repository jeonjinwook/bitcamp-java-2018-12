package bitcamp.lms;
import java.util.*;
import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    int i = 10;
    Scanner kb = new Scanner(System.in);
    int[] num = new int[i];
    String[] ti = new String[i];
    Date[] pl = new Date[i];
    int[] vi = new int[i];
    
    
    int j = 0;
    while(j < 10){
      System.out.print("번호? ");
      num[j] = kb.nextInt();
      kb.nextLine();
      
      System.out.print("내용? ");
      ti[j] = kb.nextLine();
      
      vi[j] = 0;
      
      pl[j] = new Date(System.currentTimeMillis());
      
      j++;
      
      System.out.println("계속 입력하시겠습니까?(Y/n)");
      String li = kb.nextLine();
      
      if(!li.equalsIgnoreCase("y") && !li.equalsIgnoreCase("")){
        break;
      }
      System.out.println();
    }
    kb.close();
    
    for(int m = 0 ; m < j ; m++ ) {
      System.out.printf("%d %s %s %d\n",num[m],ti[m],pl[m],vi[m]);
    }
  }
}
