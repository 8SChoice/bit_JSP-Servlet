package demo.inter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Model {
	public String execute(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException;
	

}
