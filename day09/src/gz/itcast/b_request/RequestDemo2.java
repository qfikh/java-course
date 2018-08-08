package gz.itcast.b_request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo2 extends HttpServlet {
/**
 * 注意：tomcat服务器首先会调用servlet的service方法，然后在service方法中再根据请求方式来分别调用对应的doXX方法
 * （例如，如果是GET请求方式，在service方法中调用doGet方法）
 * 
 *   因为最常的请求方式是GET 和POST，所以编写servlet程序，只需要覆盖doGet和doPost即可！！！！
 */
	
	/*@Override  //service方法接收各种请求,,然后根据请求方式将其转发给doGet,doPost方法 进行处理,
	 * 			 如果这里不覆盖service,, service会默认根据请求方式转发请求
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getMethod());
		System.out.println("service方法被调用");
	}*/
	
	
	
	/**
	 * 该方法用于接收浏览器的Get方式提交的请求
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET方式提交");
	}

	/**
	 * 该方法用于接收浏览器的Post方式提交的请求
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post方式提交");
	}

}
