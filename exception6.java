import java.io.*;
public class exception6 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        try
        {
            System.out.println("hey msg")
        }
        catch(FileNotFoundException ae)
        {
            System.out.println(ae.getMessage());
        } 
    }
}
