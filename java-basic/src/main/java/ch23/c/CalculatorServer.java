// 계산기 서버 만들기 : 최소 +, -, *, /, % 연산자는 지원한다.
package ch23.c;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
실행 예 :
- 클라이언트가 계산기 서버에 접속한 후 

계산기 서버에 오신 걸 환영합니다. <== 서버의 응답
계산식을 입력하세요! <== 서버의 응답
예) 23 + 7  <== 서버의 응답
> 23 + 7 <== 사용자의 입력. '>'문자는 클라이언트에서 출력한다.
결과는 30입니다.  <== 서버의 응답
> 23 ^ 7 <== 사용자의 입력. '>'문자는 클라이언트에서 출력한다.
^ 연산자를 지원하지 않습니다.  <== 서버의 응답
> ok + yes <== 사용자의 입력. '>'문자는 클라이언트에서 출력한다.
식의 형식이 잘못되었습니다.  <== 서버의 응답
> quit
안녕히 가세요!  <== 서버의 응답

 */

public class CalculatorServer {
  static long d = 0;
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)){

      System.out.println("계산기 서버에 오신 걸 환영합니다!");
      System.out.println("계산식을 입력하세요!");
      System.out.println("예 23 + 7");

      try (
          Socket socket = serverSocket.accept();
          PrintWriter out =new PrintWriter(socket.getOutputStream());
          DataInputStream in = new DataInputStream(
              new BufferedInputStream(socket.getInputStream()))){

        keyboard.nextLine();

        keyboard.nextLine();
        long f = in.readLong();
        String g = in.readUTF();
        long l = in.readLong();
        for (int i = 0; i < 100; i++) {
        switch (g) {
          case "+": d = f + l; 
          out.write("결과는" + d + "입니다");
          out.flush();break;
          case "-": d = f - l;
          break;
          case "*": d = f * l; 
          break;
          case "/": d = f / l;
          break;
          case "%": d = f % l;
          break;
          default:
            System.out.println("지원하지 않는 연산자입니다.");
            out.write("결과는" + d + "입니다");
            out.flush();
        }
      }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("안녕히가세요!");
  }
}

