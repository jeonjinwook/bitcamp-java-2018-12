// 바이너리 데이터 입출력 - FileOutputStream - 배열 단위로 출력하기
//
package ch22.b;

import java.io.FileOutputStream;

public class Test02_1 {
  public static void main(String[] args) {
    // 배열 값 출력
    try {
      // 주의!
      // => 기존의 파일을 덮어쓴다.
    FileOutputStream out = new FileOutputStream("date.bin");
    
    byte[] bytes = {0x11, 0x22, 0x33, 0x44, 0x55 , 0x66};
    
    // write(byte[]) : 배열의 값 전체를 출력한다.
    // write(byte[], 시작인덱스, 출력개수) : 시작 위치부터 지정된 개수를 출력한다.
    // 
    out.write(bytes); // 배열 전체를 출력한다.
    
    out.close();
    
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("출력 완료!");
  }
}














