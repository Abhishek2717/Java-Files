import java.util.*;
public class tocheckpositiveornegative 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        if(n<0)
        System.out.println("The no is negative");
        else if(n>0)
        System.out.println("The no is positive");
        else 
        System.out.println("The no is neither negative nor positive");
    }
    
}
