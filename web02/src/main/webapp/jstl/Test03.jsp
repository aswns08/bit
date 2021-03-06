<%@page import="java63.servlets.test05.domain.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Core 사용</h1>
<h2>c:if</h2>
<p>test 속성값이 참이면 내용을 출력한다.</p>
<c:set var="age" value="20"/>
<c:if test="${age == 20}">
오호라 청춘일세... 
    <button type="button">글작성</button>
</c:if>

<hr>

<c:if test="${age ==20}" var="testResult" scope="page">
  <button type="button">글작성</button>
</c:if>
조건 검사 결과: ${pageScope.testResult}<br>

<h2>c:choose</h2>
<c:set var="name" value="임꺽정"/>
<c:choose>
  <c:when test="${pageScope.name == '홍길동'}">
  관리자님 환영합니다.
  </c:when>
  <c:when test="${pageScope.name == '임꺽정'}">
  사용자님 환영합니다.
  </c:when>
  <c:otherwise>
  손님 환영합니다.
  </c:otherwise>
</c:choose>

<h2>c:forEach</h2>
<%
String[] names = {"홍길동", "임꺽정", "안중근", "윤봉길"};
pageContext.setAttribute("names", names);
%>
<ul>
<c:forEach items="${pageScope.names}" var="name">
  <li>${name}</li>
</c:forEach>
</ul>

<hr>

<ul>
<c:forEach items="${pageScope.names}" var="name" begin="1" end='2'>
  <li>${name}</li>
</c:forEach>
</ul>

<h2>c:forTokens</h2>
<%
pageContext.setAttribute("params", "name=aaa&age=20&tel=111-1111");
%>
<ul>
<c:forTokens items="${pageScope.params}" delims="&=" var="p">
  <li>${p}</li>
</c:forTokens>
</ul>








</body>
</html>