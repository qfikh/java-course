package gz.itcast.a_path;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * web应用中路径问题
 * @author APPle
 *
 */
public class PathDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//目标资源： target.html
		/**
		 * 思考： 目标资源是给谁使用的。
		 * 		给服务器使用的：   / 表示在当前web应用的根目录（即:/webapps/day11/）(相当于eclipse的webroot下面)  转发只能发生在当前项目下
		 * 		给浏览器使用的： /  表示在webapps的根目录下(即: /webapps/下面,,还没确定去哪个项目)
		 */
		/** 
		 * 1.转发 
		 */
		request.getRequestDispatcher("/target.html").forward(request, response);
		
		
		/**
		 * 2.请求重定向  浏览器
		 */
//		response.sendRedirect("/day11/target.html");
		
		/**
		 * 3.html页面的超连接href   浏览器
		 */
//		response.getWriter().write("<html><body><a href='/day11/target.html'>超链接</a><br><img src='/day11/image/1.jpg'></img></body></html>");
		
		/**
		 * 4.html页面中的form提交地址  浏览器
		 */
//		response.getWriter().write("<html><body><form action='/day11/target.html'><input type='submit'/></form></body></html>");
	}

}
