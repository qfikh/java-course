package gz.itcast.a_servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	//����doGet����
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//��������������
		resp.getWriter().write("this is hello servlet!!!    ");
		resp.getWriter().write("requesturl:" + req.getRequestURL()+ "    ");
		Enumeration<String>names = req.getHeaderNames();
		
		while(names.hasMoreElements()){
			String name= names.nextElement();
			String value = req.getHeader(name);
			System.out.println(name+"::"+value);
		}
		
	}
}
