<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>사진 목록</title>
<jsp:include page="../commonCss.jsp" />
</head>
<body>
  <jsp:include page="../header.jsp" />
  <div class="container">
    <h1>사진 목록</h1>
    <p>
      <a href='form' class="btn btn-primary btn-sm">새 사진</a>
    </p>
    <table class="table table-sm table-hover">
      <tr>
        <th scope="col">번호</th>
        <th scope="col">제목</th>
        <th scope="col">등록일</th>
        <th scope="col">조회수</th>
        <th scope="col">수업</th>
      </tr>
      <c:forEach items="${list}" var="board">
        <tr>
          <th scope="row">${board.no}</th>
          <td><a href='${board.no}'>${board.title}</a></td>
          <td>${board.createdDate}</td>
          <td>${board.viewCount}</td>
          <td>${board.lessonNo}</td>
        </tr>
      </c:forEach>
    </table>

    <form action='search'>
      수업번호: <input type='text' name='lessonNo'> 검색어: <input type='text' name='keyword'>
      <button type='submit'>검색</button>
    </form>
        <nav aria-label="목록 페이지 이동">
      <ul class="pagination justify-content-center">
        <li class="page-item ${pageNo <= 1 ? 'disabled' : ''}"><a class="page-link"
          href="?pageNo=${pageNo - 1}&pageSize=${pageSize}">이전</a></li>
        <li class="page-item active"><span class="page-link" href="#">${pageNo}</span></li>
        <li class="page-item ${pageNo >= totalPage ? 'disabled' : ''}"><a class="page-link"
          href="?pageNo=${pageNo + 1}&pageSize=${pageSize}">다음</a></li>
      </ul>
    </nav>
  </div>

  <jsp:include page="../javascript.jsp" />
</body>
</html>








