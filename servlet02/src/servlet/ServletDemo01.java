package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		ServletContext sc = config.getServletContext();
		//���ServletContext����Ĳ���
		String contextvalue = sc.getInitParameter("context_key");
	   System.out.println(contextvalue);
	}

}
