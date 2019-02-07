// 인스턴스 출력하기 - 배열 활용
package ch22.e;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test02_1 {

  public static void main(String[] args) {

    // 다음 세 학생의 성적 정보를 score.data 파일에 바이너리 형식으로 저장하라!
    // => java.io.BufferedOutputStream 클래스를 사용하라.
    // => java.io.DataOutputStream 클래스를 사용하라.
    //
    Score[] students = {
    new Score("홍길동", 100, 100, 100),
    new Score("임꺽정", 90, 90, 90),
    new Score("유관순", 80, 80, 80)
    };
    try (DataOutputStream out = new DataOutputStream(
        new BufferedOutputStream(
            new FileOutputStream("score.data")))){
      
      out.writeInt(students.length);
      
      for (Score s : students) {
      out.writeUTF(s.getName());
      out.writeInt(s.getKor());
      out.writeInt(s.getEng());
      out.writeInt(s.getMath());
      }
      
      out.flush(); // 버퍼가 채워지지않아도 버퍼에 있는 내용을 추출
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력 완료!");
  }
}

//  out2.writeUTF(s1.getName());
//  out2.writeInt(s1.getKor());
//  out2.writeInt(s1.getEng());
//  out2.writeInt(s1.getMath());
//  
//  out2.writeUTF(s2.getName());
//  out2.writeInt(s2.getKor());
//  out2.writeInt(s2.getEng());
//  out2.writeInt(s2.getMath());
//  
//  out2.writeUTF(s3.getName());
//  out2.writeInt(s3.getKor());
//  out2.writeInt(s3.getEng());
//  out2.writeInt(s3.getMath());
//  
//  out2.flush();
//  
//} catch (Exception e) {
//  e.printStackTrace();
//}