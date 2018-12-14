import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class TransactionDemo {
    public static void main(String args[]){
        try{
            Connection con=DBConnection.getConnection();
            Statement stmt=con.createStatement();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            con.setAutoCommit(false);
            try{
                String name;
                int course;
                long ph;
                System.out.println("Before transaction....");
                ResultSet rs=stmt.executeQuery("SELECT * from student");
                while(rs.next())
                    System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
                String q1="INSERT INTO student (course_id,name,Phone) values(?,?,?)";

                //Batch Processing
                /*stmt.addBatch("INSERT INTO student (course_id,name,Phone) values(101,'abc',1234)");
                stmt.addBatch("INSERT INTO student (course_id,name,Phone) values(102,'dds',2345)");
                stmt.addBatch("INSERT INTO student (course_id,name,Phone) values(103,'abds',3456)");
                stmt.addBatch("INSERT INTO student (course_id,name,Phone) values(104,'asa',4567)");
                stmt.executeBatch();
                PreparedStatement ps=con.prepareStatement(q1);
                System.out.println("Course id, name, phone: ");
                course=Integer.parseInt(br.readLine());
                name=br.readLine();
                ph=Long.parseLong(br.readLine());
                ps.setInt(1,course);
                ps.setString(2,name);
                ps.setLong(3,ph);
                ps.execute();

                //commit
                con.commit();
                System.out.println("Transaction committed....");
                ResultSet rs1=stmt.executeQuery("SELECT * from student");
                while(rs1.next())
                    System.out.println(rs1.getInt(1)+" "+rs1.getInt(2)+" "+rs1.getString(3)+" "+rs1.getInt(4));
*/
                //Select records using collection
                Set<Integer> s1=new HashSet<Integer>();
                s1.add(10001);
                s1.add(10002);
                s1.add(10003);
                s1.add(10005);
                s1.add(10006);
                s1.add(10009);
                s1.add(10011);
                s1.add(10016);

                System.out.println("Collection "+s1.toString());
                String s2=s1.toString().replace('[',' ');
                s2=s2.replace(']',' ');
                //System.out.println("Collection "+s2);
                ResultSet rs2=stmt.executeQuery("SELECT * from student where stud_id in ("+s2+")");
                while(rs2.next())
                    System.out.println(rs2.getInt(1)+" "+rs2.getInt(2)+" "+rs2.getString(3)+" "+rs2.getInt(4));
            }
            catch (Exception e){
                System.out.println(e);
                con.rollback();
                System.out.println("Rollback....");
                /*ResultSet rs=stmt.executeQuery("SELECT * from student");
                while(rs.next())
                    System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
            */}
            finally {
                con.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
