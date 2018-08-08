package gz.itcast.f_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ��������
 * ����context��ʵ�ֲ�ͬservlet֮������ݹ���
 * @author APPle
 *
 */
public class ContextDemo3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1.�õ������
		ServletContext context = this.getServletContext();
		
		//2.�����ݱ��浽������� ʵ�ֲ�ͬservlet���ݹ���
		//context.setAttribute("name", "eric");
		context.setAttribute("student", new Student("jacky",20));
		System.out.println("����ɹ�");
	}
}


class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
