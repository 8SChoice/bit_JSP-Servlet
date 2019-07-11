package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.MyMemberDTO;
import dao.MemberDao;
import dao.MemberInter;

@WebServlet("/signup")
public class MemberAdd extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euc-kr"); //response�� �ѱ� ���ڵ�
		PrintWriter pw = new PrintWriter(resp.getWriter()); //html�� ����ϴ� �Լ�
		req.setCharacterEncoding("euc-kr"); //request�� �ѱ� ���ڵ�
		MyMemberDTO dto = new MyMemberDTO(); //�������ϱ� ������ ������ �ϳ� ���� �����.
		dto.setId(req.getParameter("uid")); //�� �޾ƿ���.
		dto.setPwd(req.getParameter("pwd"));
		dto.setName(req.getParameter("name"));
		MemberInter ref = MemberDao.getDao();
		
		try { //try-catch���� ������ ���� ����� �� ���� Ŭ���ؼ� �������ָ� �ȴ�.
			ref.addMember(dto);
			pw.println("<p style='size:30px'>�Ӽ���</p>");
			
		} catch (SQLException e) {
			pw.println("<p>�ӽ���</p>");
			e.printStackTrace();
		}
		
	}

	
}
