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
			<legend>Signup Form:</legend>
			User ID:<br> 
			<input type="text" name="id" value="" id="id"> 
			<input type="button" value="중복확인" id="btn1"><br>
			 <div id="target"></div> 
			User PWD:<br>
			<input type="password" name="pwd" value="" id="pwd"> <br> 
			User Name:<br> <input type="text" name="name" value="" id="name"> <br><br> 
			<input type="text" name="zip" id="zip" placeholder="우편번호">
			<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
			<input type="text" name="addr" id="addr" placeholder="주소"><br>
			<input type="submit" value="가입하기" id="regi">
		</fieldset>
	</form>
</body>
<script
	src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(function() {
		$('#btn1').click(function() {
			console.log("Test");
		$('#target').css("width","300").css('background','red').html("hi");
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
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
    
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('zip').value = data.zonecode;
                document.getElementById("addr").value = addr;
            }
        }).open();
    }
</script>
</html>