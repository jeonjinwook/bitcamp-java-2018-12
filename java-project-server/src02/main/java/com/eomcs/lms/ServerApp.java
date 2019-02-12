// 2단계: 클라이언트 연결을 승인한다.
package com.eomcs.lms;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

  public static void main(String[] args) {

    try (ServerSocket serversocket = new ServerSocket(8888)){
      System.out.println("서버 시작!");

      while (true) {

        try (Socket socket = serversocket.accept()){
          System.out.println("클라이언트와 연결되었음.");

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
