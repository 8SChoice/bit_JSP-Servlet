<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test</title>
	<style>
	div{
	width : 300px; height:200px;
	background:orange;
	margin:auto;
	}
	div>h1{color:white; font-size:30px}
	</style>
<script>
	function clickFn(){
		console.log("�ڹ� ��ũ���� �����")
	}
</script>
</head>
<body>
	<div>
	<h1>Hello JSP�Դϴ�.</h1>
	<a href="javascript:clickFn()">click</a></div>
</body>
</html>