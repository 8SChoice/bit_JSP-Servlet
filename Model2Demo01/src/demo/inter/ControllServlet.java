package demo.inter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.MemberModel;
import hello.model.HelloModel;
//모든 요청 담당
@WebServlet("*.bit")
public class ControllServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	}
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		//요청을 분석 : http://localhost/model2Demo01/index.bit?cmd=memlist
		String cmd = req.getParameter("cmd");
		//다형성을 적용한 컨트롤러 작업을 완료, 결합도 느슨하게 설계
		Model md=null;
		if(cmd.equals("hello")) {
			md=new HelloModel();
		}else if(cmd.equals("mlist")) {
			md=new MemberModel();
		}
		String view = md.execute(req, resp);
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}

}
