// 필터나 리스너를 테스트하기 위한 서블릿
package bitcamp.ex02;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex02/s1")
public class Servlet01 extends GenericServlet {

  // GenericServlet 추상 클래스는 java.io.Serialize 인터페이스를 구현하였다.
  //    => serialVersionUID 변수 값을 설정해야 한다.
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    System.out.println("/ex02/s1 서블릿 실행!");
  }

}










