import java.util.*;
public class gcd 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int gcd=1;
        for(int i=1;i<=a&&i<=b;++i)
        {
            if(a%i==0&&b%i==0)
                gcd = i;
        }
        System.out.println("The gcd of both the numbers is:"+gcd);
    }
    
}
