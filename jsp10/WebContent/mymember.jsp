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
			<input type="button" value="�ߺ�Ȯ��" id="btn1"><br>
			 <div id="target"></div> 
			User PWD:<br>
			<input type="password" name="pwd" value="" id="pwd"> <br> 
			User Name:<br> <input type="text" name="name" value="" id="name"> <br><br> 
			<input type="text" name="zip" id="zip" placeholder="�����ȣ">
			<input type="button" onclick="sample6_execDaumPostcode()" value="�����ȣ ã��"><br>
			<input type="text" name="addr" id="addr" placeholder="�ּ�"><br>
			<input type="submit" value="�����ϱ�" id="regi">
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
				//$('#id').val() : �Է��� ��
				//�񵿱������ ���� ������ �ּҿ� ��
				url:"idSearch.jsp?id="+$('#id').val(),
				//������ �������� �� callback�Լ��� �����͸� �޴´�.
				//data:������ ������
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
                // �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.

                // �� �ּ��� ���� ��Ģ�� ���� �ּҸ� �����Ѵ�.
                // �������� ������ ���� ���� ��쿣 ����('')���� �����Ƿ�, �̸� �����Ͽ� �б� �Ѵ�.
                var addr = ''; // �ּ� ����
                var extraAddr = ''; // �����׸� ����

                //����ڰ� ������ �ּ� Ÿ�Կ� ���� �ش� �ּ� ���� �����´�.
                if (data.userSelectedType === 'R') { // ����ڰ� ���θ� �ּҸ� �������� ���
                    addr = data.roadAddress;
                } else { // ����ڰ� ���� �ּҸ� �������� ���(J)
                    addr = data.jibunAddress;
                }

                // ����ڰ� ������ �ּҰ� ���θ� Ÿ���϶� �����׸��� �����Ѵ�.
                if(data.userSelectedType === 'R'){
                    // ���������� ���� ��� �߰��Ѵ�. (�������� ����)
                    // �������� ��� ������ ���ڰ� "��/��/��"�� ������.
                    if(data.bname !== '' && /[��|��|��]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // �ǹ����� �ְ�, ���������� ��� �߰��Ѵ�.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // ǥ���� �����׸��� ���� ���, ��ȣ���� �߰��� ���� ���ڿ��� �����.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
    
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // �����ȣ�� �ּ� ������ �ش� �ʵ忡 �ִ´�.
                document.getElementById('zip').value = data.zonecode;
                document.getElementById("addr").value = addr;
            }
        }).open();
    }
</script>
</html>