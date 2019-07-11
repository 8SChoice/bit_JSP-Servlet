package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.MyMemberDTO;
import dao.MemberDao;
import dao.MemberInter;
@WebServlet("/search")
public class MemberSearch extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euc-kr");
		req.setCharacterEncoding("euc-kr");
		MemberInter dao = MemberDao.getDao();
		PrintWriter pw = new PrintWriter(resp.getWriter());
		try {
			List<MyMemberDTO> list = new ArrayList<>();
			list = dao.getListmember(req.getParameter("name"));
			StringBuffer sb = new StringBuffer();
			for(MyMemberDTO i : list) {
				sb.append(i.getName()).append("  ");
				sb.append(i.getId()).append("  ");
				sb.append(i.getEdate()).append("  \n");
			}
			
			pw.println("<p style='size:30px'>"+sb.toString()+"</p>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
