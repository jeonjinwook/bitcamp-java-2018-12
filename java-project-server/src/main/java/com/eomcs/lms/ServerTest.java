// 2단계: 서버 실행 테스트
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import com.eomcs.lms.domain.Member;

public class ServerTest {

  public static void main(String[] args) {

    try (Socket socket = new Socket("localhost", 8080);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())){
      System.out.println("서버와 연결되었음.");
      
      Member member = new Member();
      member.setNo(1);
      member.setName("홍길동");
      member.setEmail("hong@test.com");
      member.setPassword("1111");
      member.setPhoto("hong.gif");
      member.setTel("1111-1111");
      
      // Member 객체를 서버로 serialize하라!
      out.writeObject(member);
      out.flush();
      
      // 또한 서버에서 serialize한 Member 객체를 받아라.
      Object response = in.readObject();
      System.out.println("객체를 받았습니다.");

    } catch (Exception e) {
      e.printStackTrace();
    } // main try
    System.out.println("서버와의 연결을 끊었음.");
  } // main
}
