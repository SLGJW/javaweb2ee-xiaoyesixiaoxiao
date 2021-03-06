package shiyan5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberdeleteServlet
 */
@WebServlet("/MemberdeleteServlet")
public class MemberdeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberdeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String sid=request.getParameter("sid");
		try {
		    //装载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shiyan5?serverTimezone=GMT","root","c7715200");
			String sql="delete from student where sid= ?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, sid);
			int i=pst.executeUpdate();
			PrintWriter pw=response.getWriter();
			pw.write("删除成功，请点击连接查看<a href='simpleQueryServlet'><b>所有信息</b></a>");
			//关闭连接
			con.close();
	}catch(Exception ex) {
		ex.printStackTrace();
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