package gz.itcast.g_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ת����Ч������תҳ�棩
 * @author APPle
 *
 */
public class ForwardDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/**
		 * �������ݵ�request�����
		 */
		request.setAttribute("name", "rose");
		  
		//ת��	
		/**
		 * ע�⣺����ת����ǰwebӦ���������Դ��
		 */
		/*RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/GetDataServlet");
		rd.forward(request, response);*/
		this.getServletContext().getRequestDispatcher("/GetDataServlet").forward(request, response);
	}
}
