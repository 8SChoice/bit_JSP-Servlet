package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1Hello
 */
@WebServlet("/hello")  //Servlet 3.0���� �� �����̸� ������.
public class Ex1Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex1Hello() {
    	System.out.println("������ ȣ��!");

    }
	@Override
	public void init() throws ServletException {
		System.out.println("init ȣ��!");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet�޼��� ȣ��");
		//�������� ��Ʈ���� �����Ѵ�.
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset-euc-kr");
		out.println("�Է¹�����:"+request.getParameter("msg"));
		out.close();

	}
	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");
	}
}
