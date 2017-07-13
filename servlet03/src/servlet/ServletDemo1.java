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
 * 获得文件test.properties的绝对路径（新建在lib目录下）
 * */
public class ServletDemo1 extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		//获得classpath下资源的文件的流，用于classpath下文件发布之后在/WEB-INF/classes下
		//所以指定/WEB-INF/classes/test1.properties
	    InputStream in =  (InputStream) sc.getResourceAsStream("/WEB-INF/classes/test1.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			System.out.println(prop.get("key"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
}
