package gz.itcast.a_path;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * webӦ����·������
 * @author APPle
 *
 */
public class PathDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//Ŀ����Դ�� target.html
		/**
		 * ˼���� Ŀ����Դ�Ǹ�˭ʹ�õġ�
		 * 		��������ʹ�õģ�   / ��ʾ�ڵ�ǰwebӦ�õĸ�Ŀ¼����:/webapps/day11/��(�൱��eclipse��webroot����)  ת��ֻ�ܷ����ڵ�ǰ��Ŀ��
		 * 		�������ʹ�õģ� /  ��ʾ��webapps�ĸ�Ŀ¼��(��: /webapps/����,,��ûȷ��ȥ�ĸ���Ŀ)
		 */
		/** 
		 * 1.ת�� 
		 */
		request.getRequestDispatcher("/target.html").forward(request, response);
		
		
		/**
		 * 2.�����ض���  �����
		 */
//		response.sendRedirect("/day11/target.html");
		
		/**
		 * 3.htmlҳ��ĳ�����href   �����
		 */
//		response.getWriter().write("<html><body><a href='/day11/target.html'>������</a><br><img src='/day11/image/1.jpg'></img></body></html>");
		
		/**
		 * 4.htmlҳ���е�form�ύ��ַ  �����
		 */
//		response.getWriter().write("<html><body><form action='/day11/target.html'><input type='submit'/></form></body></html>");
	}

}
