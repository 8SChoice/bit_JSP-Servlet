<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<String> arlist = new ArrayList();
	arlist.add("��浿1");
	arlist.add("��浿2");
	arlist.add("��浿3");
	arlist.add("��浿4");
	arlist.add("��浿5");
	arlist.add("��浿6");
	arlist.add("��浿7");
	arlist.add("��浿8");
	request.setAttribute("list", arlist);
%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JstlDemo.jsp</title>
</head>
<body>
	<div>
		<h3>�̸�����Ʈ ����</h3>
		<table style="border: 1px solid;">
			<tr>
				<td>�̸�</td>
			</tr>
			<tr>
				<c:forEach var="data" items="${list}">
					<td>${data }</td>
				</c:forEach>
			</tr>
		</table>
	</div>

</body>
</html>