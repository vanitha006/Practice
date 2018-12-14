import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection(){
        Properties prop=new Properties();
        FileInputStream fis;
        Connection con = null;
        try{
            fis=new FileInputStream("/home/vanitha/IdeaProjects/EmployeeDetails/src/main/resources/sample.properties");
            prop.load(fis);

            Class.forName(prop.getProperty("DB_DRIVER_CLASS"));
            con=DriverManager.getConnection(prop.getProperty("DB_URL"),
                    prop.getProperty("DB_USERNAME"),prop.getProperty("DB_PASSWORD"));
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }

}
