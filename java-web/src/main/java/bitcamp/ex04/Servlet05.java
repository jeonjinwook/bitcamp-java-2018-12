// 썸네일 이미지 만들기
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;

@MultipartConfig(maxFileSize = 1024 * 1024 )
@WebServlet("/ex04/s8")
public class Servlet05 extends GenericServlet {

  private static final long serialVersionUID = 1L;
  private String uploadDir;

  @Override
  public void init() throws ServletException {
    this.uploadDir = this.getServletContext().getRealPath("/upload");
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    // 테스트
    // - http://localhost:8080/java-web/ex04/test08.html 실행
    //
    
    req.setCharacterEncoding("UTF-8");

    HttpServletRequest httpReq = (HttpServletRequest) req;

    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<table>servlet04</title>");
    out.println("</head>");
    out.println("<body><h1>파일 업로드 결과</h1>");

    // 일반 폼 데이터는 원래 하던 방식대로 값을 꺼낸다
    out.printf("이름=%s<br>\n", httpReq.getParameter("name"));
    out.printf("나이=%s<br>\n", httpReq.getParameter("age"));

    // 파일 데이터는 getPart()를 이용한다.
    Part photoPart = httpReq.getPart("photo");
    String filename = "";
    if (photoPart.getSize() > 0) {
      // 파일을 선택해서 업로드 했다면,
      filename = UUID.randomUUID().toString();
      photoPart.write(this.uploadDir + "/" + filename);
    }
    
    // 원본 사진을 가지고 특정 크기의 썸네일 이미지를 만들기
    //  1) 썸네일 이미지를 생성해주는 자바라이브러리 추가
    //      => mvnrepository.com에서 thumbnailator 라이브러리 검색
    //      => build.gradle 에 추가
    //      => gradle eclipse 실행
    //      => eclipse IDE에서 해당 프로젝트 갱신
    
    //  2) 썸네일 이미지 만들기
    //      => 원본 이미지 파일이 저장된 경로를 알려주고
    //          어떤 썸네일 이미지를 만들어야 하는지 설정한다.
    Thumbnails.of(this.uploadDir + "/" + filename)
    .size(20, 20)
    .outputFormat("jpg")
    .toFiles(Rename.PREFIX_DOT_THUMBNAIL);;
    
    out.printf("사진=%s<br>\n", filename);
    out.printf("<img src='../upload/%s'><br>\n", filename);
    out.println("</body></html>");

  }
}

// <form> 태그의 enctype을 "multipart/form-data" 로 설정하면,
// 웹 브라우저가 데이터를 전송할 때 다음과 같은 형식으로 보낸다.
// 요청 프로토콜에서 Content-Type을 확인하라.
// 
/*
POST /java-web/ex04/s4 HTTP/1.1
Host: 192.168.0.4:8080
Content-Length: 7222
Pragma: no-cache
Cache-Control: no-cache
Origin: http://192.168.0.4:8080
Upgrade-Insecure-Requests: 1
Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryzVY11GiqDpSP3H8f
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,
Referer: http://192.168.0.4:8080/java-web/ex04/test04.html
Accept-Encoding: gzip, deflate
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7,la;q=0.6
Connection: keep-alive
빈 줄
------WebKitFormBoundaryzVY11GiqDpSP3H8f
Content-Disposition: form-data; name="name"

홍길동
------WebKitFormBoundaryzVY11GiqDpSP3H8f
Content-Disposition: form-data; name="age"

20
------WebKitFormBoundaryzVY11GiqDpSP3H8f
Content-Disposition: form-data; name="photo"; filename="images.jpeg"
Content-Type: image/jpeg

바이너리 데이터....
------WebKitFormBoundaryzVY11GiqDpSP3H8f--
 */











