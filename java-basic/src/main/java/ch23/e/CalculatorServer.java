// Stateless 응용 - 서버에서 계산 결과 유지하기
package ch23.e;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class CalculatorServer {
public static void main(String[] args) {
  
  HashMap<Integer, Integer> map = new HashMap<>();
    
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");
      
      
      while (true) {
        
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {
          
          System.out.println("클라이언트와 연결됨! 요청처리 중....");
          
          int ne = in.read();
          
          int result = 0;
          
          if (map.get(ne) != null) {
            result = map.get(ne);
          }
          
          String dos = in.readLine();
          if (dos.equalsIgnoreCase("reset")) {
            map.put(ne, 0);
            continue;
          }
          
          String[] input = dos.split(" ");
          
          int b = 0;
          String op = " ";
          
          try {
            
          op = input[0];
          b = Integer.parseInt(input[1]);
          } catch (Exception e) {
            out.println("식의 형식이 바르지 않습니다.");
            out.flush();
            continue;
          }
          switch (op) {
            case "+": result += b; break;
            case "-": result -= b; break;
            case "*": result *= b; break;
            case "/": result /= b; break;
            case "%": result %= b; break;
            default:
              out.printf("%s 연산자를 지원하지 않습니다.\n", op);
              out.flush();
              continue;
          }
          
          out.printf("결과는 %d 입니다.\n", result);
          out.flush();
          map.put(ne, result);
          System.out.println("클라이언트와 연결 끊음!");
          
        } catch (Exception e) {
          System.out.println("클라이언트와 통신 중 오류 발생!");
        }
        
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}


