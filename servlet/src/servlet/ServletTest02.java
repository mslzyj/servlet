package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/*
 * ServletTest02����ʵ���������ֶ�������������web��������
 * Servlet���������ڣ�
 * void init(ServletConfig config)  ���� ��servlet��һ�α����ʵ�ʱ��ᱻ����
 *          servlet��ʵ��Ĭ��������ǵ�һ�α����ʵ�ʱ�򴴽����ɱ䣩�Ժ���ʲ��ᱻ����
 * void service(ServletRequest request,ServletResponse response)  ִ�й���
 *    ÿ����������ʱ�򶼻ᱻ����
 * void destory()  ����
 *    ��ServletTest02����ʵ�������ٵ�ʱ�򱻵���
 * */
public class ServletTest02 implements Servlet {

	@Override
	//ִ��ʱ����Servlet��ʵ���������ٵ�ʱ�򱻵���
	public void destroy() {
		// TODO �Զ����ɵķ������
       System.out.println("distory����������");
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
       System.out.println("init����������");
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
		System.out.println("service����������");
	    response.getOutputStream().write("<font color='yello'>Service����������</font>".getBytes());
	}

}
