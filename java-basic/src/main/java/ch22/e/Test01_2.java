// 인스턴스 읽기
package ch22.e;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test01_2 {

  public static void main(String[] args) {
    
    // score.data 파일에서 세 학생의 데이터를 읽어 Score 인스턴스로 생성하라.
 // => java.io.BufferedInputStream 클래스를 사용하라.
    // => java.io.DataInputStream 클래스를 사용하라.
    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    
    try (FileInputStream in = new FileInputStream("score.data");
        BufferedInputStream in1 = new BufferedInputStream(in);
        DataInputStream in2 = new DataInputStream(in1)){
      
      s1.setName(in2.readUTF());
      s1.setKor(in2.readInt());
      s1.setEng(in2.readInt());
      s1.setMath(in2.readInt());
      
      System.out.printf("%s %d %d %d %d %.1f\n"
          ,s1.getName()
          ,s1.getKor()
          ,s1.getEng()
          ,s1.getMath()
          ,s1.getSum()
          ,s1.getAver());
      
      s2.setName(in2.readUTF());
      s2.setKor(in2.readInt());
      s2.setEng(in2.readInt());
      s2.setMath(in2.readInt());
      
      System.out.printf("%s %d %d %d %d %.1f\n"
          ,s2.getName()
          ,s2.getKor()
          ,s2.getEng()
          ,s2.getMath()
          ,s2.getSum()
          ,s2.getAver());
      
      
      s3.setName(in2.readUTF());
      s3.setKor(in2.readInt());
      s3.setEng(in2.readInt());
      s3.setMath(in2.readInt());
      
      System.out.printf("%s %d %d %d %d %.1f\n"
          ,s3.getName()
          ,s3.getKor()
          ,s3.getEng()
          ,s3.getMath()
          ,s3.getSum()
          ,s3.getAver());
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("읽기 완료!");
  }
}
