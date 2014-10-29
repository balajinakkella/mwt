import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet
{
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
    response.setContentType("text/html;charser=UTF-8");
    PrintWriter out=response.getWriter();
    String email=request.getParameter("email");
    String pass=request.getParameter("pass");
    if(Validate.checkUser(email,pass))
    {
      RequestDispatcher rs=request.getRequestDispatcher("Welcome");
      rs.forward(request,response);
    }
    else
    {
      out.println("Incorrect Username or Password");
      RequestDispatcher rs=request.getRequestDispatcher("index.html");
      rs.include(request,response);
    }
  }
}
