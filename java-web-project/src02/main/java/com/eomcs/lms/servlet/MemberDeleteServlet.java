package com.eomcs.lms.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.lms.InitServlet;
import com.eomcs.lms.service.MemberService;

@SuppressWarnings("serial")
@WebServlet("/member/delete")
public class MemberDeleteServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Spring IoC 컨테이너에서 BoardService 객체를 꺼낸다.
    MemberService memberService = 
        InitServlet.iocContainer.getBean(MemberService.class);
    int no = Integer.parseInt(request.getParameter("no"));

    if (memberService.delete(no) > 0) {
      response.sendRedirect("list");
      return;
    }
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<html><head>"
        + "<title>회원 삭제</title>"
        + "<meta http-equiv='Refresh' content='1;url=list'>"
        + "</head>");
    out.println("<body><h1>회원 삭제</h1>");
    out.println("<p>해당 번호의 회원이 없습니다.</p>");
    out.println("</body></html>");
  }


}
