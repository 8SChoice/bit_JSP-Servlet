<%@page import="vo.CustomerVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	ArrayList singerList = new ArrayList();
	singerList.add("�ҳ�ô�");
	singerList.add("�����ɽ�");
	request.setAttribute("singerList", singerList);

	CustomerVO[] customerList = new CustomerVO[2];
	CustomerVO cust1 = new CustomerVO();
	cust1.setName("ȫ�浿");
	cust1.setEmail("hong@nate.com");
	cust1.setPhone("011-235-4789");

	CustomerVO cust2 = new CustomerVO();
	cust1.setName("�̼���");
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
		<li>�̸� : ${customerList[0].name }</li>
		<li>�̸��� : ${customerList[0].eamil }</li>
		<li>��ȭ��ȣ : ${customerList[0].phone }</li>
	</ul>
	<ul>
		<li>�̸� : ${customerList[1].name }</li>
		<li>�̸��� : ${customerList[1].eamil }</li>
		<li>��ȭ��ȣ : ${customerList[1].phone }</li>
	</ul>
</body>
</html>