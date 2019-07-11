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
		System.out.println("ù��° ������");
		String msg = "hello";
		//RequestScope�� ���� �����غ���.
		req.setAttribute("msg", msg);
		//redirect������� �̵��Ѵ�.
		resp.sendRedirect("second"); //"/second" �ƴ�.
		PrintWriter out = resp.getWriter();
		out.println("first Page");
		out.println("<hr>");
		out.close();
	}
	
}
