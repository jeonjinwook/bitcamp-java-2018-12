<%@page import="com.eomcs.lms.domain.Lesson"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%
  List<Lesson> list = (List<Lesson>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<title>수업 목록</title>
</head>
<body>
  <jsp:include page="/header.jsp" />
  <h1>수업 목록(JSP)</h1>
  <p>
    <a href='add'>새 수업</a>
  </p>
  <p>
    <a href='../'>수업 목록(JSP)</a>
  </p>
  <table border='1'>
    <tr>
      <th>번호</th>
      <th>수업명</th>
      <th>등록일</th>
      <th>총수업시간</th>
      <%
        for (Lesson lesson : list) {
      %>
    
    <tr>
      <td><%=lesson.getNo()%></td>
      <td><a href='detail?no=<%=lesson.getNo()%>'><%=lesson.getTitle()%></a></td>
      <td><%=lesson.getStartDate()%> ~ <%=lesson.getEndDate()%></td>
      <td><%=lesson.getTotalHours()%></td>
    </tr>
    <%}%>
  </table>
</body>
</html>









