import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException{
        PrintWriter out=response.getWriter();
        try{
            out.println("<!DOCTYPE HTML><html><h2>Get Method</h2><br/>" +
                    "URI: "+request.getRequestURI()+"<br/>" +
                    "Name: "+request.getParameter("fname")+" "+request.getParameter("lname")+"</html>");
        }
        finally {
            out.close();
        }
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter out=response.getWriter();
        try{
            out.println("<!DOCTYPE HTML><html><h2>Post Method</h2><br/>" +
                    "URI: "+request.getParameterNames()+"<br/>" +
                    "Name: "+request.getParameter("fname")+" "+request.getParameter("lname")+"</html>");
        }
        finally {
            out.close();
        }
    }
}
