import java.util.*;
public class exception4 
{
    public static void main(String args[])
    {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the age of candiate");
        age=s.nextInt();
        try 
        {
            if(age>30)
            throw new ArithmeticException("age is invalid");
            System.out.println("Sucessfully registred");
            System.out.println("continue filling");
        } catch (ArithmeticException e) 
        {
            System.out.println("Message"+e.getMessage());    //TODO: handle exception
        }   
    }    
}
