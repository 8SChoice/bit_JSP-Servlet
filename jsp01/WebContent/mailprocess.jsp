<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>mailprocess.jsp</title>
<%
	//jsp�����Լ�
	//request, response�� ������ ����
	//request(��û)->HttpServletResponse
	//response(����)->HttpServletResponse
	//��û�� ������ ���
	//Client�� �����ǰ��� ��ȯ
	String reip=request.getRemoteAddr();
	System.out.println("reip"+reip);
	//�ѱ�ó��
	request.setCharacterEncoding("euc-kr");
	//���� ����ó��
	int age=Integer.parseInt(request.getParameter("age"));
%>
<style>
table{
width:300px;}
table>tbody>tr>td:nth-child(1){
width:100px;
background:orange;
}
#wrap{
width:300px;
margin:auto;
}
</style>
</head>
<body>
<div id="wrap">
	<table>
		<tr>
			<th colspan="2">���ϸ� ����Ʈ</th>
		</tr>
		<tr>
			<td>�̸�</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>�̸���</td>
			<td><%=request.getParameter("email") %></td>
		</tr>
		<tr>
			<td>����</td>
			<td><%=age%></td>
		</tr>
		<tr>
			<th colspan="2"><input type="button" value="������" onclick="location='mailstdemo.jsp'"></th>
		</tr>	
	</table>
	<br>
	<table>
	<%
	for(int i=0; i<age; i++){
	%>
	<tr><td><%=i %></td></tr>
	<%
	}
	%></table>
	</div>


</body>
</html>