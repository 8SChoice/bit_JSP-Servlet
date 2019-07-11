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
		resp.setContentType("text/html;charset=euc-kr"); //response값 한글 인코딩
		PrintWriter pw = new PrintWriter(resp.getWriter()); //html에 출력하는 함수
		req.setCharacterEncoding("euc-kr"); //request값 한글 인코딩
		MyMemberDTO dto = new MyMemberDTO(); //보내야하기 때문에 깡통을 하나 새로 만든다.
		dto.setId(req.getParameter("uid")); //값 받아오기.
		dto.setPwd(req.getParameter("pwd"));
		dto.setName(req.getParameter("name"));
		MemberInter ref = MemberDao.getDao();
		
		try { //try-catch문은 빨간줄 떠서 쓰라고 할 때만 클릭해서 생성해주면 된다.
			ref.addMember(dto);
			pw.println("<p style='size:30px'>머성공</p>");
			
		} catch (SQLException e) {
			pw.println("<p>머실패</p>");
			e.printStackTrace();
		}
		
	}

	
}
