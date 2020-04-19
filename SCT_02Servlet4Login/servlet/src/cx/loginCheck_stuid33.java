package cx;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * servlet implementation class loginCheck_stuid33
 */
@SuppressWarnings("unused")
@WebServlet("/loginCheck_stuid33")
public class loginCheck_stuid33 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginCheck_stuid33() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			String account=request.getParameter("account");
			String password=request.getParameter("password");
			if(account.equals("chuxun") && password.equals("7715200")) {
				 Cookie cx = new Cookie("account", account);
				 Cookie cx1=new Cookie("password",password);
				 cx.setMaxAge(60*60*24);
				 cx1.setMaxAge(60*60*24);
				 response.addCookie(cx);
				 response.addCookie(cx1);
				 response.sendRedirect("loginSucceeded_stuid33");
			}
	        else{
				request.getRequestDispatcher("login_stuid33.html").forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}