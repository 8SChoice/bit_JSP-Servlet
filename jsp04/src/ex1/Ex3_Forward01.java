package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstForward")
public class Ex3_Forward01 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("첫번째 페이지");
		String msg = "hello";
		//RequestScope에 값을 저장해본다.
		req.setAttribute("msg", msg);
		//현재 서블릿의 req, resp를 함께 전달하면서 second로 포워딩한다.
		//url변경없음,requestScope값이 유지
		RequestDispatcher rd = req.getRequestDispatcher("second");
		rd.forward(req, resp);
	}

}
