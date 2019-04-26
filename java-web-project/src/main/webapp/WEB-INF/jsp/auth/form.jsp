<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
</head>
<link rel="stylesheet"
  href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
  integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
  crossorigin="anonymous">
<body>

  <jsp:include page="../header.jsp" />

  <div class="container">
    <h1>로그인(JSP)</h1>
    <form action='login' method='post'>
        <div class="form-group">
          <label for="email">이메일</label> 
          <input type="email"
            class="form-control" id="email" name="email"
            value='${cookie.email.value}'
             aria-describedby="emailHelp"
            placeholder="이메일을 입력하세요."> 
          <small id="emailHelp" class="form-text text-muted">
             당신의 이메일을 결코 다른 사이트와 공유하지 않습니다.</small>
        </div>
        <div class="form-group">
          <label for="password">암호</label>
           <input type="password" class="form-control" id="password" name="password"
           placeholder="암호를 입력하세요">
        </div>
        <div class="form-group form-check">
          <input type="checkbox" class="form-check-input" id="saveEmail" name="saveEmail">
          <label class="form-check-label" for="saveEmail">이메일 저장</label>
        </div>
        <button class="btn btn-primary">로그인</button>
      </form>
  </div>
  <!-- .container -->

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>

  <jsp:include page="../javascript.jsp" />
</body>
</html>
