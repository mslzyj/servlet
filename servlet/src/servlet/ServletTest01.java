package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletTest01 implements Servlet {

	@Override
	//ִ��ʱ����Servlet��ʵ���������ٵ�ʱ�򱻵���
	public void destroy() {
		// TODO �Զ����ɵķ������
       System.out.println("Servlet������");
	}

	@Override
	//���ServletConfig�����ö���
	public ServletConfig getServletConfig() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	//��õ�ǰServlet��������Ϣ
	public String getServletInfo() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	/*
	 * ִ��ʱ������Servletʵ��������ʱ�򱻵��ã�����ʼ������
	   ServletConfig �� Servlet�����ö��󣬳�ʼ����ʱ����Խ�������
	*/
	public void init(ServletConfig arg0) throws ServletException {
		// TODO �Զ����ɵķ������
       System.out.println("servlet����������ˡ�");
	}

	@Override
	/*
	 * ִ��ʱ������һ����������ǰServlet��ʱ�򱻵���
	 * ����ǰ��Servlet��ҵ���߼����Ұ���Ӧ���ظ������
	 * �������ܺ���Ӧ����
	 * */
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO �Զ����ɵķ������
		System.out.println("��Ӧ����");
	    response.getOutputStream().write("<font color='yello'>ServeletTest</font>".getBytes());
	}

}
