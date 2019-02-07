// 인스턴스 읽기 - 컬렉션 API사용
package ch22.e;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Test03_2 {

  public static void main(String[] args) {

    // score.data 파일에서 세 학생의 데이터를 읽어 Score 인스턴스로 생성하라.
    // => java.io.BufferedInputStream 클래스를 사용하라.
    // => java.io.DataInputStream 클래스를 사용하라.
    ArrayList<Score> students = new ArrayList<>();

    try (FileInputStream in = new FileInputStream("score.data");
        BufferedInputStream in1 = new BufferedInputStream(in);
        DataInputStream in2 = new DataInputStream(in1)){

      int len = in2.readInt();

      for (int i =0; i < len; i++) {
        Score s = new Score();
        s.setName(in2.readUTF());
        s.setKor(in2.readInt());
        s.setEng(in2.readInt());
        s.setMath(in2.readInt());
        students.add(s);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    for (Score s : students) {
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n"
          ,s.getName()
          ,s.getKor()
          ,s.getEng()
          ,s.getMath()
          ,s.getSum()
          ,s.getAver());
    }
  }
  
}
