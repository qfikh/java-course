package gz.itcast.d_init;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * �в�����init���޲ε�init����
 * @author APPle
 *
 */
public class InitDemo extends HttpServlet {
		
	/**
	 * �в�����init����
	 * �÷�����servlet���������ڷ�����һ���ᱻtomcat����������
	 */
	/**
	 * ע�⣺���Ҫ��д��ʼ���룬����Ҫ�����в�����init����
	 */
	/*@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("�в�����init����");
	}*/
	
	/**
	 * �޲�����init����
	 * �÷�����servlet�ı�д��ʼ������ķ�������Sun��˾��Ƴ���ר�Ÿ������߽��и��ǣ�Ȼ���������дservlet�ĳ�ʼ�߼�����ķ�����
	 */
	@Override
	public void init() throws ServletException {
		System.out.println("�޲�����init����");
	}
	
	
}
