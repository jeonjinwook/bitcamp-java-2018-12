// 바이트 데이터를 읽어 primitive data type으로 바꾸기
package ch22.c;

import java.io.FileInputStream;

public class Test04_3 {
  public static void main(String[] args) {
    
    try (FileInputStream in = new FileInputStream("data.bin");
        BufferdInputStream in1 = new BufferdInputStream(in);
        DataInputStream in2 = new DataInputStream(in1)){
      // 바이너리 데이터를 읽을 때는 저장한 순서(파일 포맷)에 맞춰 읽어야 한다.
      int no = in2.readInt();
      String name = in2.readUTF();
      int age = in2.readInt();
      
      System.out.printf("%d, %s, %d\n", no, name, age);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("읽기 완료!");
  }
}














