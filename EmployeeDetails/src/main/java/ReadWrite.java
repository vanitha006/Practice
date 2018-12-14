import java.io.*;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String a[]){
        try {

            //Read from file

            /*BufferedReader br = new BufferedReader(new FileReader("/home/vanitha/test1"));
            String str;
            while( (str = br.readLine())!= null)
                System.out.println(str);*/

            /*FileReader fr=new FileReader("/home/vanitha/test1");
            int i;
            while( (i = fr.read())!= -1)
                System.out.print((char)i);*/

            /*Scanner sc=new Scanner(new File("/home/vanitha/test1"));
            sc.useDelimiter("\\Z");
            System.out.println(sc.next());*/


            //Write to file

            File file=new File("test.txt");
            file.createNewFile();
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/vanitha/test"));
            bw.write("xqcew");
            bw.append(" ecwecc");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("/home/vanitha/test"));
            String str;
            while( (str = br.readLine())!= null)
                System.out.println(str);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
