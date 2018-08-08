package gz.itcast.c_response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ������Ӧ��Ϣ
 * @author APPle
 *
 */
public class ResponseDemo1 extends HttpServlet {

	/**
	 * 1)tomcat��������������Ϣ��װ��HttpServletRequest�����Ұ���Ӧ��Ϣ��װ��HttpServletResponse
	 * 2��tomcat����������doGet����������request����response����
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 3��ͨ��response����ı���Ӧ��Ϣ
		 */
		/**
		 * 3.1 ��Ӧ��
		 */
		//response.setStatus(404);//�޸�״̬��
		//response.sendError(404); // ����404��״̬��+404�Ĵ���ҳ��
		
		
		
		/**
		 * 3.2 ��Ӧͷ
		 */
		response.setHeader("server", "JBoss");
		
		
		/**
		 * 3.3 ʵ������(�����ֱ���ܹ����������ݾ���ʵ������)
		 */
		//response.getWriter().write("01.hello world"); //�ַ����ݡ�
		response.getOutputStream().write("02.hello world".getBytes());//�ֽ�����
		 

	}
	
	/**
	 * 4)tomcat��������response���������ת������Ӧ��ʽ���ݣ��ٷ��͸������������
	 */

}
