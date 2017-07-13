package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoadOnServlet extends HttpServlet {

	
	@Override
	public void init() throws ServletException {
		System.out.println("LoadOnServlet实例被创建，随着tomcat的启动被创建");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet被调用");
		resp.getOutputStream().write("doGet被调用".getBytes());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
   
}
