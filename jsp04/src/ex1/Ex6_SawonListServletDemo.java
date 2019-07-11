//package ex1;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import DTO.MyMemberDTO;
//import dao.MemberDao;
//import dao.MemberInter;
//import dao.SawonImple;
//
//@WebServlet("/slist")
//public class Ex6_SawonListServletDemo extends HttpServlet {
//	private MemberInter sdao;
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html;charset=euc-kr");
//		PrintWriter out = resp.getWriter();
//		out.println("<p> 사원리스트</p>");
//		sdao = MemberDao.getDao();
//		List<MyMemberDTO> slist = sdao.getListmember("");
//		StringBuffer sb = new StringBuffer();
//		for (MyMemberDTO e : slist) {
//			sb.append("<p>").append(e.getId()).append("</p>");
//		}
//		out.println(sb.toString());
//		out.close();
//	}
//}
