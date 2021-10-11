<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�� ���</title>
</head>
<body>
	<center>
	<h1>�� ���</h1>
	<h3>${userName}�� ȯ���մϴ�...<a href="logout.do">Log-out</a></h3>
	
	<!-- �˻� ���� -->
	<form action="getBoardList.do" method="post">
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<td align="right">
				<select name="searchCondition">
					<c:forEach items="${conditionMap}" var="option">
						<option valuee="${option.value}">${option.key}
					</c:forEach>
				</select>
				<input name="searchKeyword" type="text"/>
				<input type="submit" value="�˻�"/>
			</td>
		</tr>
	</table>
	</form>
	<!-- �˻� ���� -->
	
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
			<th bgcolor="orange" width="100">��ȣ</th>
			<th bgcolor="orange" width="200">����</th>
			<th bgcolor="orange" width="150">�ۼ���</th>
			<th bgcolor="orange" width="150">�����</th>
			<th bgcolor="orange" width="100">��ȸ��</th>
		</tr>
		
		<c:forEach items="${boardList}" var="board">
		<tr>
			<td>${board.seq}</td>
			<td align="left"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
			<td>${board.writer}</td>
			<td>${board.regDate}</td>
			<td>${board.cnt}</td>
		</tr>
		</c:forEach>
	</table>
	<br>
	<a href="insertBoard.jsp">���� ���</a>
	</center>
</body>
</html>