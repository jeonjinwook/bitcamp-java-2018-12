<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>새 사진</title>
<jsp:include page="../commonCss.jsp" />
</head>
<body>
  <jsp:include page="../header.jsp" />
  <div class="container">
    <h1>새 사진</h1>
    <form action='add' method='post' enctype='multipart/form-data'>

      <div class="form-group row">
        <label for="title" class="col-sm-2 col-form-label">수업</label>
        <div class="col-sm-10">
          <div class="input-group mb-3">
            <select name='lessonNo' class="custom-select" id="inputGroupSelect01">
              <option value='0'>수업을 선택하세요</option>
              <c:forEach items="${lessons}" var="lesson">
                <option value="${lesson.no}">${lesson.title}</option>
              </c:forEach>
            </select>
          </div>
        </div>
      </div>
      <div class="form-group row">
        <label for="title" class="col-sm-2 col-form-label">사진 제목</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="title" id="title" />
        </div>
      </div>
      <div class="form-group row">
        <div class="custom-file">
          <input name='photo' type="file" class="custom-file-input" id="inputGroupFile04"
            aria-describedby="inputGroupFileAddon04"> <label class="custom-file-label"
            for="inputGroupFile04">최소 한 개의 사진 파일을 등록해야 합니다.</label>
        </div>
      </div>

      <div class="form-group row">
        <div class="custom-file">
          <input name='photo' type="file" class="custom-file-input" id="inputGroupFile04"
            aria-describedby="inputGroupFileAddon04"> <label class="custom-file-label"
            for="inputGroupFile04">최소 한 개의 사진 파일을 등록해야 합니다.</label>
        </div>
      </div>


      <div class="form-group row">
        <div class="custom-file">
          <input name='photo' type="file" class="custom-file-input" id="inputGroupFile04"
            aria-describedby="inputGroupFileAddon04"> <label class="custom-file-label"
            for="inputGroupFile04">최소 한 개의 사진 파일을 등록해야 합니다.</label>
        </div>
      </div>

      <div class="form-group row">
        <div class="custom-file">
          <input name='photo' type="file" class="custom-file-input" id="inputGroupFile04"
            aria-describedby="inputGroupFileAddon04"> <label class="custom-file-label"
            for="inputGroupFile04">최소 한 개의 사진 파일을 등록해야 합니다.</label>
        </div>
      </div>

      <div class="form-group row">
        <div class="custom-file">
          <input name='photo' type="file" class="custom-file-input" id="inputGroupFile04"
            aria-describedby="inputGroupFileAddon04"> <label class="custom-file-label"
            for="inputGroupFile04">최소 한 개의 사진 파일을 등록해야 합니다.</label>
        </div>
      </div>
      <div class="form-group row">
        <div class="col-sm-10">
          <a class="btn btn-primary" href='./'>사진목록</a>
          <button class="btn btn-primary">등록</button>
        </div>
      </div>
    </form>

  </div>
  <jsp:include page="../javascript.jsp" />
</body>
</html>








