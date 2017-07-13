package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 重写doGet和doPost方法
 * doGet是给get方式的http的请求做响应的
 * doPost是给post方式请求做相应的
 * */
public class HttpServletDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet方法被调用了");
		resp.getOutputStream().write("doGet方法被调用".getBytes());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost方法被调用了");
		doGet(req,resp);
	}

	@Override
	public void init() throws ServletException {
		// TODO 自动生成的方法存根
		System.out.println("LoadOn实例被创建了");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}
	
}
