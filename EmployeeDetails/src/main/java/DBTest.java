import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {

    public static void main(String args[]) {
        try {
            Connection con=DBConnection.getConnection();
            Statement stmt=con.createStatement();

            //STATEMENTS
            /*stmt.execute("CREATE TABLE IF NOT EXISTS test(id int(5),name varchar(20),dept varchar(20))");
            stmt.execute("INSERT INTO test(id,name,dept) VALUES (101, 'abc','dept1'),(102, 'xyz','dept2')");

            ResultSet rs=stmt.executeQuery("SELECT * from test");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));*/

            //PREPARED STATEMENT

            stmt.execute("CREATE TABLE IF NOT EXISTS test(id int(5),name varchar(20),dept varchar(20))");
            String query="INSERT INTO test(id,name,dept) VALUES (?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,103);
            ps.setString(2,"name1");
            ps.setString(3,"name2");
            ps.execute();

            ResultSet rs=stmt.executeQuery("SELECT * from test");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            ps.close();
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
