<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div id="wrap">
	<form method="post" action="homework.jsp">
	<input type="hidden" name="mode" value="ok">
		단 : <input type="number" name="dan" id="dan">
		색상 : <input type="color" name="color" id="color">
		범위 : <select name="limits">
			<option>3</option><option>5</option><option>7</option>
			</select>
			<input type="submit" value="가입">
			</form>
			<%
			String mode=request.getParameter("mode");
			if(mode !=null){
				String col= request.getParameter("color");
				int dan = Integer.parseInt(request.getParameter("dan"));
				int lim = Integer.parseInt(request.getParameter("limits"));
				int dann = lim/2;
			%>
			<table>
			
			<%
				for(int i=1; i<=9; i++){
			%>		
			<tr>
				<%for(int j=dan-dann; j<=dan+dann; j++){%>
			<%if(j==dan){ %>
			<td style="background:<%=col %>">		
				<%=j%>*<%=i%>=<%=i*j%>
			</td>
			<%} else{ %>
			<td>
			<%=j%>*<%=i%>=<%=i*j%>
			</td>
			<%} %>
			<%
				}
			%>
			</tr>
			<%
				}
			%>
			
			</table>
			</div>
			<%
			}
			%>
</body>
</html>