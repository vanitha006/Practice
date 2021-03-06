import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class SignupServlet extends HttpServlet {

    final static Logger logger= LoggerFactory.getLogger(SignupServlet.class.getName());
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        PrintWriter out=response.getWriter();
        try{
            out.println("<!DOCTYPE HTML><html> Name: "+request.getParameter("fname")+" "+request.getParameter("lname"));

            Connection con=DBConnection.getConnection("demo");

            Statement stmt=con.createStatement();
            stmt.execute("create table if not exists customer(custId int(5) primary key, firstname varchar(20), " +
                    "lastname varchar(20), email varchar(20), password varchar(20))");

            logger.info("Details added for: "+request.getParameter("fname")+" "+request.getParameter("lname"));

            ResultSet r=stmt.executeQuery("select max(custId) from customer");
            int id=0;
            while(r.next()) {
                id=r.getInt(1);
            }
            id++;

            stmt.execute("insert into customer values('"+ id +"','"+request.getParameter("fname")+"','"+request.getParameter("lname")+
                    "','"+request.getParameter("email")+"','"+request.getParameter("pass")+"')");


            out.println("<br/><br/>************************************************************<br/><br/>");
            ResultSet rs=stmt.executeQuery("Select * from customer");
            while(rs.next())
            {
                out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"<br/>");
            }
            out.println("<br/><br/><a href='index.html'>Back</a></html>");
        } catch (SQLException e) {
            out.println(e);
            logger.warn("Exception Occured: "+e);
        } finally {
            out.close();
        }
    }
}
