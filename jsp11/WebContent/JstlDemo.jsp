<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<String> arlist = new ArrayList();
	arlist.add("김길동1");
	arlist.add("김길동2");
	arlist.add("김길동3");
	arlist.add("김길동4");
	arlist.add("김길동5");
	arlist.add("김길동6");
	arlist.add("김길동7");
	arlist.add("김길동8");
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
		<h3>이름리스트 데모</h3>
		<table style="border: 1px solid;">
			<tr>
				<td>이름</td>
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