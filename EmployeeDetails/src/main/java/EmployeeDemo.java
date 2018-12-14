import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class EmployeeDemo extends FullTimeEmployee{

    public static  void  main(String args[]){
        FullTimeEmployee emp1=new FullTimeEmployee("name_test","female","Accounts",30000);
        FullTimeEmployee emp2=new FullTimeEmployee("name_test","female","Accounts",30000);
        FullTimeEmployee emp3=new FullTimeEmployee("name_test","female","Accounts",30000);
        FullTimeEmployee emp4=new FullTimeEmployee("name_test","female","Accounts",30000);

        emp4.dispDetails();
    }
}
