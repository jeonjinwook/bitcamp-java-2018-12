package bitcamp.lms;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    
    System.out.println("번호: ");
    int num = kb.nextInt();
    kb.nextLine();
    System.out.println("이름: ");
    String name = kb.nextLine();
    System.out.println("이메일: ");
    String ea = kb.nextLine();
    System.out.println("암호: ");
    int pa = kb.nextInt();
    kb.nextLine();
    System.out.println("사진: ");
    String pi = kb.nextLine();
    System.out.println("전화: ");
    String ca = kb.nextLine();
    System.out.println("가입일: ");
    String ti = kb.nextLine();
    
    System.out.printf(" 번호: %d\n 이름: %s\n 이메일: %s\n 암호: %d\n 사진: %s\n "
        + "전화: %s\n 가입일: %s\n",num,name,ea,pa,pi,ca,ti);
  }
}
