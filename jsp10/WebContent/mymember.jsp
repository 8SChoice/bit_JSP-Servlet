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
			User ID:<br> <input type="text" name="id" value="" id="id"> 
			<input type="button" value="중복확인" id="btn1">
			 <br>
			 <div id="target"></div> 
			 User PWD:<br>
			<input type="password" name="pwd" value=""> <br> 
			User Name:<br> <input type="text" name="name" value=""> <br>
			<br> 
			<input type="submit" value="Submit">
		</fieldset>
	</form>
</body>
<script
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(function() {
		$('#btn1').click(function() {
			//console.log("Test");
			//$('#target').css("width","300").css('background','red').html("hi");
			$.ajax({
				//$('#id').val() : 입력한 값
				//비동기식으로 보낼 서버의 주소와 값
				url:"idSearch.jsp?id="+$('#id').val(),
				//응답이 성공했을 때 callback함수로 데이터를 받는다.
				//data:서버의 데이터
				success:function(data){
					console.log(data);
					$('#target').css("width","300").css('background','yellow').html(data);
				}
			});
		});
	});
</script>
</html>