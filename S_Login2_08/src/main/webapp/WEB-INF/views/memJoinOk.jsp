<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>memJoin Ok</h1>
	ID : ${member.memId}<br />
	PW : ${member.memPw}<br />
	Mail : ${member.memMail} <br />
	Phone : ${member.memPhone.memPhone1} - ${member.memPhone.memPhone2} - ${member.memPhone.memPhone3}<br />
	
	<a href="/login/resources/html/memJoin.html"> Go MemberJoin </a>
</body>
</html>