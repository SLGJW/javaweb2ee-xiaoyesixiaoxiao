package chuxun;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet1
 */
@SuppressWarnings("unused")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
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
				 Cookie ck = new Cookie("account", account);
				 Cookie ck1=new Cookie("password",password);
				 ck.setMaxAge(60*60*24);
				 ck1.setMaxAge(60*60*24);
				 response.addCookie(ck);
				 response.addCookie(ck1);
				 HttpSession session = request.getSession();
				 session.setAttribute("account", account);
				 response.sendRedirect("index2.html");
			}else {
				request.getRequestDispatcher("index1.html").forward(request, response);
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