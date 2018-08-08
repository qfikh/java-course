package gz.itcast.f_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * �õ�webӦ��·��
 * @author APPle
 *
 *
 *���Ҫ�޸���Ŀ����,,:(1) ��eclipse���޸�day10 to day11  (2) �����Ŀ --> properties-->  web project setting --�޸ķ�����tomcat��Ӧ������
 */
public class ContextDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.�õ�ServletContext����
		//ServletContext context = this.getServletConfig().getServletContext();
		ServletContext context = this.getServletContext(); //���Ƽ�ʹ�ã�
		
		
		//2.�õ�webӦ��·��  /day10
		/**
		 * webӦ��·��������tomcat�����������е�webӦ������
		 */
		String contextPath = context.getContextPath();
		
		System.out.println(contextPath);
		
		
		/**
		 * ������Ӧ�õ������ض���
		 */
		response.sendRedirect(contextPath+"/index.html");
	}

}
