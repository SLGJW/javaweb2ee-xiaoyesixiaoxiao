package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String title = "表单提交的信息";
        String servlet="学生信息录入";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
            "<html>\n" +
            "<head><title>" + servlet + "</title></head>\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<ul>\n" +
            "  <li><b>学号</b>:"
            +request.getParameter("name")+ "\n" +"<p>"+"</p>"+
            "  <li><b>姓名</b>:"
            + request.getParameter("url")+ "\n" +"<p>"+"</p>"+
             "<li><b>生日</b>:"
            +request.getParameter("bday")+"\n"  );
        out.println("<p>"+"</p>") ; 
   	    String[] values = request.getParameterValues("man") ;
	    if(values!=null&&values.length>0) {
	        for(int i= 0 ;i<values.length;i++)
	        	out.println("<li><b>"+"性别 :"+values[i]+"</b>")       ;  
	   }
	    out.println("<p>"+"</p>") ; 
	    String[] values1 = request.getParameterValues("sp") ;
	    if(values1!=null&&values1.length>0) {
	    	out.println("<li><b>"+"体育爱好:"+"</b>");
	        for(int k= 0 ;k<values1.length;k++)
	            out.println("<b>"+values1[k]+"</b>");
	    }
	    out.println("</ul>");
	    out.println("</body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}