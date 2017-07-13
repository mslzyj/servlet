package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletTest01 implements Servlet {

	@Override
	//执行时机：Servlet的实例对象被销毁的时候被调用
	public void destroy() {
		// TODO 自动生成的方法存根
       System.out.println("Servlet销毁了");
	}

	@Override
	//获得ServletConfig的配置对象
	public ServletConfig getServletConfig() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	//获得当前Servlet的属性信息
	public String getServletInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	/*
	 * 执行时机：当Servlet实例创建的时候被调用，做初始化工作
	   ServletConfig ： Servlet的配置对象，初始化的时候可以进行配置
	*/
	public void init(ServletConfig arg0) throws ServletException {
		// TODO 自动生成的方法存根
       System.out.println("servlet组件被创建了。");
	}

	@Override
	/*
	 * 执行时机：当一个请求请求当前Servlet的时候被调用
	 * 处理当前的Servlet的业务逻辑并且把响应返回给浏览器
	 * 参数接受和响应请求
	 * */
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		System.out.println("响应请求");
	    response.getOutputStream().write("<font color='yello'>ServeletTest</font>".getBytes());
	}

}
