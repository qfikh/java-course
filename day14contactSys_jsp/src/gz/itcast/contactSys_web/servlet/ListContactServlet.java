package gz.itcast.contactSys_web.servlet;

import gz.itcast.contactSys_web.dao.ContactDao;
import gz.itcast.contactSys_web.dao.impl.ContactDaoImpl;
import gz.itcast.contactSys_web.entity.Contact;
import gz.itcast.contactSys_web.service.ContactService;
import gz.itcast.contactSys_web.service.impl.ContactServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 显示所有联系人的逻辑
 * @author APPle
 * 为什么day13,14 的通讯录项目都报 java.io.FileNotFoundException: e:/contact.xml (No such file or directory)
 * .XMLUtil.getDocument(XMLUtil.java:25)  明明改了呀
 */
public class ListContactServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.从xml中读取出联系人数据
		ContactService service = new ContactServiceImpl();
		List<Contact> list = service.findAll();
		
		//2.把结果保存到域对象中
		request.setAttribute("contacts", list);
		
		//3.跳转到jsp页面
		request.getRequestDispatcher("/listContact.jsp").forward(request, response);		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
