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
@WebServlet("/hello")  //Servlet 3.0부터 이 한줄이면 끝난다.
public class Ex1Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex1Hello() {
    	System.out.println("생성자 호출!");

    }
	@Override
	public void init() throws ServletException {
		System.out.println("init 호출!");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet메서드 호출");
		//브라우저와 스트림을 연결한다.
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset-euc-kr");
		out.println("입력받은값:"+request.getParameter("msg"));
		out.close();

	}
	@Override
	public void destroy() {
		System.out.println("destroy 호출");
	}
}
