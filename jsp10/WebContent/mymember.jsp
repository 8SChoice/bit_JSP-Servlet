<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>mymember.jsp</title>
</head>
<body>
<form action="myjoin.jsp" method="post">
  <fieldset>
    <legend>Login Form:</legend>
    User ID:<br>
    <input type="text" name="id" value="">
    <br>
    User PWD:<br>
    <input type="password" name="pwd" value="">
    <br>
    User Name:<br>
    <input type="text" name="name" value="">
    <br>
    <br>
    <input type="submit" value="Submit">
  </fieldset>
</form>

</body>
</html>