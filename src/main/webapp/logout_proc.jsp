<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//1.�������� ����� ���� ��ü�� ���� ����
	session.invalidate();
	
	//2.���� ���� ��, ���� ȭ������ �̵�
	response.sendRedirect("login.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>