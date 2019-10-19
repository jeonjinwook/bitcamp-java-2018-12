<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>사진 조회</title>
<jsp:include page="../commonCss.jsp" />
</head>
<body>

  <jsp:include page="../header.jsp" />
  <div class="container">
    <h1>사진 조회</h1>
    <c:choose>
      <c:when test="${empty board}">
        <p>해당 사진을 찾을 수 없습니다.</p>
      </c:when>
      <c:otherwise>
        <div class="form-group row">
          <label for="no" class="col-sm-2 col-form-label">번호</label>
          <div class="col-sm-10">
            <input type="text" class="form-control-plaintext" name="no" id="no" value='${board.no}'
              readonly />
          </div>
        </div>

        <div class="form-group row">
          <label for="createdDate" class="col-sm-2 col-form-label">등록일</label>
          <div class="col-sm-10">
            <input type="text" class="form-control-plaintext" id="createdDate"
              value='${board.createdDate}' readonly />
          </div>
        </div>

        <div class="form-group row">
          <label for="viewCount" class="col-sm-2 col-form-label">조회수</label>
          <div class="col-sm-10">
            <input type="text" class="form-control-plaintext" id="viewCount"
              value='${board.viewCount}' readonly />
          </div>
        </div>

        <div class="form-group row">
          <label for="title" class="col-sm-2 col-form-label">제목</label>
          <div class="col-sm-10">
            <input type="text" class="form-control" name="title" id="title" value='${board.title}' />
          </div>
        </div>

        <div class="form-group row">
          <label for="title" class="col-sm-2 col-form-label">수업</label>
          <div class="col-sm-10">
            <div class="input-group mb-3">
              <select name='lessonNo' class="custom-select" id="inputGroupSelect01">
                <c:forEach items="${lessons}" var="lesson">
                  <option value='${lesson.no}' ${(board.lessonNo == lesson.no) ? "selected" : ""}>
                    ${lesson.title}(${lesson.startDate} ~ ${lesson.endDate})</option>
                </c:forEach>
              </select>
            </div>
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
          <div class="col-sm-8">
            <a class="btn btn-primary" href='.'>목록</a> <a class="btn btn-primary"
              href='delete/${board.no}'>삭제</a>
            <button class="btn btn-primary">변경</button>
          </div>
        </div>
        </form>
      </c:otherwise>
    </c:choose>
  </div>
  <!-- .container -->

  <jsp:include page="../javascript.jsp" />
</body>
</html>




