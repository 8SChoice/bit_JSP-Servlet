<%@page import="java.util.HashMap"%>
<%@page import="vo.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	CustomerVO cust = new CustomerVO();
	cust.setName("홍길동");
	cust.setEmail("hong.nate.com");
	cust.setPhone("011-1234-5678");
	request.setAttribute("customer", cust);
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("name", "소나타");
	map.put("maker", "현대자동차");

	request.setAttribute("car", map);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<ul>
		<li>이름 : ${customer.name }</li>
		<li>이메일 : ${customer.email }</li>
		<li>전화번호 : ${customer.phone }</li>
	</ul>
	</body>
</html>
