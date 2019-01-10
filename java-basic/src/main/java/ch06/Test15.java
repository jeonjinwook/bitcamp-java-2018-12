package ch06;

public class Test15 {
  public static void main(String[] args) {
    
    if(args.length<4) {
      System.out.println("실행 형식: java -cp ./bin/main ch05.Test15 이름 국어점수 영어점수 수학점수");
      return;
    }
    
    int sum = 0;
    for (int i = 1; i < args.length; i++) 
      sum += Integer.parseInt(args[i]);
    
    System.out.printf(" 이름: %S\n" ,  args[0]);
    System.out.printf(" 총점: %d\n" ,  sum);
    System.out.printf(" 평균: %.1f\n" ,  sum / 3f);
  
  }
}