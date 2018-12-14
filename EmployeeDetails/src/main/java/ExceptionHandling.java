import org.apache.log4j.Logger;

import java.io.*;


public class ExceptionHandling {

    final static Logger logger=Logger.getLogger(ExceptionHandling.class.getName());
    public static void main(String args[])
    {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        int a=0,b=0;
        int arr[]=new int[5];

            try{
                System.out.println("Enter 1st number: ");
                a=Integer.parseInt(br.readLine());
                System.out.println("Enter 2nd number: ");
                b=Integer.parseInt(br.readLine());
                try {
                    System.out.println("Enter array of 5 elements: ");
                    for (int i = 0; i <= 5; i++)
                        arr[i] = Integer.parseInt(br.readLine());
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array index out of bounds exception");
                    logger.warn("Array index out of bound exception");
                }
                try {
                    FileReader file = new FileReader("demo.txt");
                }
                catch (FileNotFoundException e){
                    System.out.println("File not found");
                    logger.error("File not found exception");
                }
                catch (Exception e){
                    System.out.println(e);
                }
                //arthmetic exception
                try{
                    int c=a/b;
                    System.out.println("Quotient: "+c);
                    logger.info("Quotient: "+c);
                }
                catch(ArithmeticException e){
                    System.out.println("Arithmetic Exception");
                    logger.warn("Arithmetic exception");
                }
                catch (Exception e){
                    System.out.println("Exception occured: "+e);
                }
                finally {
                    System.out.println("Finally block.....");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Number format exception");
                logger.warn("Number Format exception");
            }
            catch(IOException e){
                System.out.println("IO Exception");
            }
            catch(Exception e){
                System.out.println("Exception occured: "+e);
            }

        }
}
