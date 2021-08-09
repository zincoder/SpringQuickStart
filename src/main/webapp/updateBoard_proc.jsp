<%@ page import="com.springbook.biz.board.impl.*" %>
<%@ page import="com.springbook.biz.board.*" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//1.����� �Է� ���� ����
	request.setCharacterEncoding("EUC-KR");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	//2.DB ���� ó��
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	
	//3.ȭ�� �׺���̼�
	response.sendRedirect("getBoardList.jsp");
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