<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td>姓名</td><td>学号</td><td>年龄</td></tr>
<c:forEach items="${list['one'] }" var="li">
<tr><td>${li.name }</td><td>${li.number }</td><td>${li.age }</td></tr>
</c:forEach>
</table>
</body>
</html>