import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Welcome extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        try{
            /*Cookie ck[]=request.getCookies();
            out.println("<!DOCTYPE HTML><html><body><h4>Welcome "+ck[0].getValue()+"<br/><br/>Max age: "+ck[0].getMaxAge()+"</h4></body></html>");*/

            HttpSession session=request.getSession();
            out.println("<!DOCTYPE HTML><html><body><h4>Welcome "+session.getAttribute("user name")+"<br/><br/>" +
                    "Password: "+session.getAttribute("Password")+"" +
                    "<br><br/>Session Id: "+session.getId()+
                    "<br><br/>Creation time: "+session.getCreationTime()+
                    "<br><br/>Last accessed time: "+session.getLastAccessedTime()+"</h4></body></html>");
        }finally {
            out.close();
        }
    }
}
