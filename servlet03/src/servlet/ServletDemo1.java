package servlet;

import java.io.*;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.portable.InputStream;
/*
 * ����ļ�test.properties�ľ���·�����½���libĿ¼�£�
 * */
public class ServletDemo1 extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		//���classpath����Դ���ļ�����������classpath���ļ�����֮����/WEB-INF/classes��
		//����ָ��/WEB-INF/classes/test1.properties
	    InputStream in =  (InputStream) sc.getResourceAsStream("/WEB-INF/classes/test1.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			System.out.println(prop.get("key"));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
}
