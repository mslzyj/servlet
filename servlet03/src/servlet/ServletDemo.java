package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 获得文件test.properties的绝对路径（新建在lib目录下）
 * */
public class ServletDemo extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		//获得工程的webRoot下文件的绝对路径
		//getRealPath参数内容不会被校验，只有真正用这个路径的时候才知道这个路径对不对
		//String path = sc.getRealPath("test.properties");
		String path = sc.getRealPath("/");
		String path1 = sc.getRealPath("/upload");
		System.out.println(path1);
		System.out.println(path);
		/*InputStream in= this.getClass().getClassLoader().getResourceAsStream("test.properties");
	    Properties properties = new Properties();
	    try {
			properties.load(in);
			System.out.println(properties.get("key"));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}*/
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
}
