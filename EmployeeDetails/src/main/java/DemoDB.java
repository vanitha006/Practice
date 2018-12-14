import java.sql.*;

public class DemoDB {

    public static void main(String args[]){
        try{
            //Class.forName("com.mysql.jdbc.Driver");

            //System.out.println("Driver class found");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","2113");
            Statement stmt=con.createStatement();

            //stmt.executeUpdate("CREATE DATABASE demo");

            //Create Table
            stmt.execute("CREATE TABLE IF NOT EXISTS demotable (id int(5), name varchar(20), dept varchar(20))");
            //Insertion
            stmt.execute("INSERT INTO demotable(id, name, dept) VALUES (103,'rew','vrht')");
            //stmt.execute("DELETE FROM demotable where id=101");

            //Update
            stmt.execute("UPDATE demotable SET name='efg' where id=101");

            //Select
            ResultSet rs=stmt.executeQuery("SELECT * FROM demotable");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
