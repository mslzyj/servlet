package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import org.hibernate.validator.constraints.Email;

public class HttpServletDeam01 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}


	@Override
	public void init(ServletConfig config) throws ServletException {
		String usernameString = config.getInitParameter("username");
		System.out.println(usernameString);
		//获得所有参数名
		config.getInitParameterNames();
		Enumeration enums = config.getInitParameterNames();
		while(enums.hasMoreElements()){
	     String name=(String)enums.nextElement();
	     String value = config.getInitParameter(name);
	     System.out.println(value);
		  
		}
	}

	
	

}
