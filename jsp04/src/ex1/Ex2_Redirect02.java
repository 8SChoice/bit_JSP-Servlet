package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class Ex2_Redirect02 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("�ι�° ������!");
		//requestScope�� ����� ���� �����غ���.
		String msg = (String)req.getAttribute("msg");
		System.out.println("msg:"+msg);
		PrintWriter out = resp.getWriter();
		out.println("<p Style='color:red'>");
		out.println("Second Page");
		out.println("</p><hr>");
		out.close();
	}
}
