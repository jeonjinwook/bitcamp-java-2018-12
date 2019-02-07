// Serialize - seriaVersionUID 스태틱 필드 사용하기
package ch22.f;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3_1 {

  public static void main(String[] args) {
    try (ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("score3.data"))) {
      
      // 인스턴스 출력하기
      
      // Score3 클래스는 java.io.Serializable을 구현하였다.
      // serialVersionUID의 값은 100로 설정하였다.
      // => Score3 클래스에 tel 필드와 getter/setter 가 없는 상태에서
      //        이 클래스를 실행하라!
      //
      out.writeObject(new Score3("홍길동", 100, 100, 100));
      
      System.out.println("출력 완료!");
      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
