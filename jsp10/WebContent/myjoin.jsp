<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="vo" class="DTO.MyMemberDTO" />
<%-- vo.set*(request.getParameter(*)) --%>
<jsp:setProperty property="*" name="vo" />
<%
	MemberDao.getDao().addMember(vo);
	response.sendRedirect("success.jsp");
%>
