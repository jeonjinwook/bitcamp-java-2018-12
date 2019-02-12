// 2단계: 클라이언트 연결을 승인한다.
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

  public static void main(String[] args) {

    try (ServerSocket serversocket = new ServerSocket(8080)){
      System.out.println("서버 시작!");

      while (true) {

        try (Socket socket = serversocket.accept();
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
          
          System.out.println("클라이언트와 연결되었음.");
          
          // 클라이언트에서 serialize해서 보내온 Member 객체의 내용을 출력하라.
          Object request = in.readObject();
          System.out.println(request);
          
          // 그리고 즉시 클라이언트로 Member 객체를 serialize하여 보내라!
          out.writeObject(request);
          out.flush();

        } catch (Exception e) {
          e.printStackTrace();
        } // sub try
        System.out.println("클라이언트와 연결을 끊었음.");
      }

    } catch (Exception e) {
      e.printStackTrace();
    } // main try
  } // main
}
