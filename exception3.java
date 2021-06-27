import java.util.*;
public class exception3 
{
    public static void main(String args[])
    {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the age of the candidate");
        age=s.nextInt();
        if(age>30)
        throw new ArithmeticException("age exceeds or age invalid");
        System.out.println("Valid age and now continue filling the forms");
    }
    
}
