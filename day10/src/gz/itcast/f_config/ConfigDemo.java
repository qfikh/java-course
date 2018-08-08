package gz.itcast.f_config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {
	/**
	 * �������δ���GenericServlet�Ѿ�д�ˣ����������д����
	 */
	/*private ServletConfig config;*/
	
	/**
	 *  1��tomcat����������Щ�������ڼ���webӦ�õ�ʱ�򣬷�װ��ServletConfig������ 
	 *  2��tomcat����������init��������ServletConfig����
	 */
	/*@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}*/
	
	  
   
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ��ȡservlet�ĳ�ʼ����
		 */
		String path = this.getServletConfig().getInitParameter("path");

		File file = new File(path);
		//��ȡ����
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = null;
		while( (str=br.readLine())!=null ){
			System.out.println(str);
		}
		  
		//��ѯ��ǰservlet�����г�ʼ������
		Enumeration<String> enums = this.getServletConfig().getInitParameterNames();
		while(enums.hasMoreElements()){
			String paramName = enums.nextElement();
			String paramValue = this.getServletConfig().getInitParameter(paramName);
			System.out.println(paramName+"="+paramValue);
		}
		
		//�õ�servlet������
		String servletName = this.getServletConfig().getServletName();
		System.out.println(servletName);
	}

}
