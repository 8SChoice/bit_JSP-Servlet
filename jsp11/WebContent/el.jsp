<%@page import="java.util.HashMap"%>
<%@page import="vo.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	CustomerVO cust = new CustomerVO();
	cust.setName("ȫ�浿");
	cust.setEmail("hong.nate.com");
	cust.setPhone("011-1234-5678");
	request.setAttribute("customer", cust);
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("name", "�ҳ�Ÿ");
	map.put("maker", "�����ڵ���");

	request.setAttribute("car", map);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<ul>
		<li>�̸� : ${customer.name }</li>
		<li>�̸��� : ${customer.email }</li>
		<li>��ȭ��ȣ : ${customer.phone }</li>
	</ul>
	</body>
</html>
