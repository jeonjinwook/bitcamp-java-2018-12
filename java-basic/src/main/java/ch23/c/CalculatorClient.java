// 계산기 클라이언트 만들기
package ch23.c;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
public static void main(String[] args) {
  try (Scanner keyboard = new Scanner(System.in);
      Socket socket = new Socket("localhost",8888);
      // 문자열을 주고 받기 편하도록 오리지널 입출력 스트림 객체에 데코레이터를 붙인다.
      PrintWriter out = new PrintWriter(socket.getOutputStream());
      DataInputStream in = new DataInputStream(
          new BufferedInputStream(socket.getInputStream()))){
    System.out.println("서버와 연결되었음!");

    System.out.print(">");
    long i = keyboard.nextInt();
    String g = keyboard.nextLine();
    long l = keyboard.nextInt();
    out.write((int) i);
    out.write((String)g);
    out.write((int) l);
    out.flush(); // 스트림 객체의 내부 버퍼에 출력된 내용을 네트워크로 방출시킨다.
    System.out.println("서버에 데이터를 보냈음!");


  } catch (Exception e) {
    e.printStackTrace();
  }
}
}
