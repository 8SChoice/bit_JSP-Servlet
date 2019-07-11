package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Ex2_Redirect01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("첫번째 페이지");
		String msg = "hello";
		//RequestScope에 값을 저장해본다.
		req.setAttribute("msg", msg);
		//redirect방식으로 이동한다.
		resp.sendRedirect("second"); //"/second" 아님.
		PrintWriter out = resp.getWriter();
		out.println("first Page");
		out.println("<hr>");
		out.close();
	}
	
}
