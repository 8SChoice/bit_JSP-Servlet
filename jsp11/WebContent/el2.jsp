<%@page import="vo.CustomerVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	ArrayList singerList = new ArrayList();
	singerList.add("소녀시대");
	singerList.add("원더걸스");
	request.setAttribute("singerList", singerList);

	CustomerVO[] customerList = new CustomerVO[2];
	CustomerVO cust1 = new CustomerVO();
	cust1.setName("홍길동");
	cust1.setEmail("hong@nate.com");
	cust1.setPhone("011-235-4789");

	CustomerVO cust2 = new CustomerVO();
	cust1.setName("이순신");
	cust1.setEmail("lee@nate.com");
	cust1.setPhone("02-789-8523");

	customerList[0] = cust1;
	customerList[1] = cust2;
	request.setAttribute("customerList", customerList);
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>${singerList[0]}, ${singerList[1]}</li>
	</ul>
	<ul>
		<li>이름 : ${customerList[0].name }</li>
		<li>이메일 : ${customerList[0].eamil }</li>
		<li>전화번호 : ${customerList[0].phone }</li>
	</ul>
	<ul>
		<li>이름 : ${customerList[1].name }</li>
		<li>이메일 : ${customerList[1].eamil }</li>
		<li>전화번호 : ${customerList[1].phone }</li>
	</ul>
</body>
</html>