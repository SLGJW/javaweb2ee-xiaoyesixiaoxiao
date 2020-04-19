package cx;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginSucceeded_stuid33
 */
@WebServlet("/loginSucceeded_stuid33")
public class loginSucceeded_stuid33 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginSucceeded_stuid33() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=utf-8");
	        response.setCharacterEncoding("utf-8");
	        PrintWriter out = response.getWriter();
	        Cookie cx[] = request.getCookies();
	        Cookie cx1[] = request.getCookies();
			if ((cx != null)&&(cx1!=null)) {
	            String name = cx[0].getValue();
	            String password = cx1[0].getValue();
	            if (!name.equals("") || password.equals("")) {
	            	out.println("<h1 align=\"center\">登录保护页面</h1>");
	                out.println("<p align=\"center\">欢迎admin访问本系统</p>");
	                out.println("<div align=\"center\">");
	                out.println("<a href=\"logout_stuid33\">注销</a>");
	                out.println("</div>");
                }
	        }
		    else {
	    		out.println("<div align=\"center\">");
				out.println("<h1>未登录，请先<a href=\"login_stuid33.html\">登录</a></h1>");
				out.println("</div>");
	        }
	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}