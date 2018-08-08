package gz.itcast.f_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ��context���л�ȡ����
 * @author APPle
 *
 */
public class ContextDemo4 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.�õ������
		ServletContext context = this.getServletContext();
		
		//2.���������ȡ������
		//String name = (String)context.getAttribute("name");
		Student student = (Student)context.getAttribute("student");
		//System.out.println("name="+name);
		
		System.out.println(student);
	}

}
