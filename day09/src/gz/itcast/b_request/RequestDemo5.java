package gz.itcast.b_request;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ��ȡGET��ʽ��Post��ʽ�ύ�Ĳ���
 * @author APPle
 *
 */
public class RequestDemo5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * ���ò�����ѯ�ı���
		 * �÷���ֻ�ܶ�����ʵ�����ݵ����ݱ��������á�POST�ύ��������ʵ�������У����Ը÷�����POST������Ч��
		 * GET�����Ĳ�������URI���棬���Զ�GET��ʽ��Ч������
		 */
		request.setCharacterEncoding("utf-8");
		
		
	/*	System.out.println("GET��ʽ");
		//����GET��ʽ�ύ�Ĳ���
		String value = request.getQueryString();
		System.out.println(value);*/
		
		
		/**
		 * ͳһ����ػ�ȡ��������ķ���
		 */
		System.out.println(request.getMethod()+"��ʽ");
		//getParameter(name): ���ݲ������õ�����ֵ(ֻ�ܻ�ȡһ��ֵ�Ĳ���)
		String name = request.getParameter("name");
		
		/**
		 * �ֶ����½���(iso-8859-1 �ַ���-> utf-8 �ַ���)
		 */
		/*if("GET".equals(request.getMethod())){
			name = new String(name.getBytes("iso-8859-1"),"utf-8");
		}*/
		
		String password = request.getParameter("password");
		
		/*if("GET".equals(request.getMethod())){
			password = new String(password.getBytes("iso-8859-1"),"utf-8");
		}*/
		
		System.out.println(name+"="+password);
		
		System.out.println("=============================");
		Enumeration<String> enums = request.getParameterNames();
		while( enums.hasMoreElements() ){
			String paramName = enums.nextElement();
			
			//�����������hobit�������getParameterValues
			if("hobit".equals(paramName)){
				/**
				 * getParameterValues(name): ���ݲ�������ȡ����ֵ�����Ի�ȡ���ֵ��ͬ��������
				 */
				System.out.println(paramName+":");
				String[] hobits = request.getParameterValues("hobit");
				for(String h: hobits){
				/*	if("GET".equals(request.getMethod())){
						h = new String(h.getBytes("iso-8859-1"),"utf-8");
					}*/
					System.out.print(h+",");
				}
				System.out.println();
				//�������hobit�������getParameter
			}else{
				String paramValue = request.getParameter(paramName);
				/*
				if("GET".equals(request.getMethod())){
					paramValue = new String(paramValue.getBytes("iso-8859-1"),"utf-8");
				}*/
				
				System.out.println(paramName+"="+paramValue);
			}
		}
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*System.out.println("POST��ʽ");
		InputStream in = request.getInputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while(  (len=in.read(buf))!=-1 ){
			System.out.println(new String(buf,0,len));
		}*/
		
		/**
		 * ͳһ����ػ�ȡ��������ķ���
		 */
		/*System.out.println("POST��ʽ");
		//���ݲ������õ�����ֵ
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name+"="+password);
		
		System.out.println("=============================");
		Enumeration<String> enums = request.getParameterNames();
		while( enums.hasMoreElements() ){
			String paramName = enums.nextElement();
			String paramValue = request.getParameter(paramName);
			System.out.println(paramName+"="+paramValue);
		}*/
		
		//һ������doGet��ʽ
		this.doGet(request, response);
	}

}
