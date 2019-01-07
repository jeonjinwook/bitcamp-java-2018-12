package bitcamp.lms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    
    System.out.println("번호: ");
    int num = kb.nextInt();
    kb.nextLine();
    System.out.println("내용: ");
    String ta = kb.nextLine();
    System.out.println("작성일: ");
    String ti = kb.nextLine();
    System.out.println("조회수: ");
    int se = kb.nextInt();
    
    System.out.printf(" 번호: %d\n 내용: %s\n 작성일: %s\n 조회수: %d\n"
        ,num,ta,ti,se);
  }

}
