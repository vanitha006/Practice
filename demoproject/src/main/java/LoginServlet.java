import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.logging.Logger;

public class LoginServlet extends HttpServlet {
    final static Logger logger=LoggerFactory.getLogger(LoginServlet.class.getName());
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
            //out.println("Session created for "+request.getParameter("uname"));
            logger.info("Session created for "+request.getParameter("uname"));

            /*RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/welcome");
            dispatcher.forward(request, response);*/
        }finally {
            out.close();
        }
    }
}
