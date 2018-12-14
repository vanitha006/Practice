import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        try {
            out.println("<!DOCTYPE HTML><html><body>" +
                    "Name: "+request.getParameter("uname")+"<br/></body></html>");
            //out.println(request.getParameter("uname"));

            //Cookie
            /*Cookie username=new Cookie("user","cookie: "+request.getParameter("uname"));
            username.setMaxAge(6000);
            response.addCookie(username);
            out.println("Cookie added");
            out.println("<!DOCTYPE HTML><html><body><h4><a href='welcome'>Welcome Page</a></h4></body></html>");*/


            //session
            HttpSession session=request.getSession();
            session.setAttribute("user name",request.getParameter("uname"));
            session.setAttribute("Password",request.getParameter("pass"));
            out.println("Session started");
            out.println("<!DOCTYPE HTML><html><body><h4><a href='welcome'>Welcome Page</a></h4></body></html>");

            /*RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/welcome");
            dispatcher.forward(request, response);*/
        }finally {
            out.close();
        }
    }
}
