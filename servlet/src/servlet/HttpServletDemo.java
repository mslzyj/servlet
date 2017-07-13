package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * ��дdoGet��doPost����
 * doGet�Ǹ�get��ʽ��http����������Ӧ��
 * doPost�Ǹ�post��ʽ��������Ӧ��
 * */
public class HttpServletDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet������������");
		resp.getOutputStream().write("doGet����������".getBytes());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost������������");
		doGet(req,resp);
	}

	@Override
	public void init() throws ServletException {
		// TODO �Զ����ɵķ������
		System.out.println("LoadOnʵ����������");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
}
