package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * ����ļ�test.properties�ľ���·�����½���libĿ¼�£�
 * */
public class ServletDemo extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		//��ù��̵�webRoot���ļ��ľ���·��
		//getRealPath�������ݲ��ᱻУ�飬ֻ�����������·����ʱ���֪�����·���Բ���
		//String path = sc.getRealPath("test.properties");
		String path = sc.getRealPath("/");
		String path1 = sc.getRealPath("/upload");
		System.out.println(path1);
		System.out.println(path);
		/*InputStream in= this.getClass().getClassLoader().getResourceAsStream("test.properties");
	    Properties properties = new Properties();
	    try {
			properties.load(in);
			System.out.println(properties.get("key"));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}*/
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
}
