package hello.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.inter.Model;
import hello.vo.HelloVO;

public class HelloModel implements Model {
	public String excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<HelloVO> list = new ArrayList<>();

		for (int i = 0; i < 1; i++) {
			HelloVO v = new HelloVO();
			v.setMsg("Hi");
			list.add(v);
		}
		request.setAttribute("list", list);
		return "hello.jsp";
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
