import java.util.*;
public class twinprime 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first and second number:");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                i++;
            
        }
        for(int j=1;j<=b;j++)
        {
            if(b%j==0)
            j++;
            
        }
        int d=(int)Math.abs(b-a);
        if(d==2&&a==2&&b==2)
        {
            System.out.println("twin prime number");
        }
        else 
            System.out.println("the numbers are not twin prime number:");
        
    }
    
}
