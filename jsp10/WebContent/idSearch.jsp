<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%--웹상에서의 공백 제거, Ajax용 서버측 스크립트, 테스트 한 후에 적용--%>
<%@ page trimDirectiveWhitespaces="true"%>
<% String idv = request.getParameter("id");
//Dao
int cnt=MemberDao.getDao().getIdCount(idv);
String msg = "";
if(cnt==0){
	msg="사용가능합니다.";
}else{
	msg="이미 사용중이랍니다.";
}
%>
<%=msg%>