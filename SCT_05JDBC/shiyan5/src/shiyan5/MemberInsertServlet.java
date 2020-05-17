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
 * Servlet implementation class MemberInsertServlet
 */
@WebServlet("/MemberInsertServlet")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertServlet() {
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
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		String sbirthday=request.getParameter("sbirthday");
		String ssex=request.getParameter("ssex");
		try {
		    //装载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shiyan5?serverTimezone=GMT","root","c7715200");
			String sql="INSERT INTO student (sid, sname, sbirthday, ssex) VALUES (?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, sid);
			pst.setString(2, sname);
			pst.setString(3, sbirthday);
			pst.setString(4, ssex);
			pst.executeUpdate();
			PrintWriter pw=response.getWriter();
			pw.write("学生信息插入成功,请点击连接查看<a href='simpleQueryServlet'><b>所有信息</b></a>");
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