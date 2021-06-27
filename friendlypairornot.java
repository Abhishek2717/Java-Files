import java.util.*;
public class friendlypairornot 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=s.nextInt(); 
        System.out.println("enter the second number:");
        int b=s.nextInt();
        float sum1=0,sum2=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                 sum1=sum1+i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                 sum2=sum2+i;
            }
        }
        if(sum1/a==sum2/b)
        {
            System.out.println("number is friendly");
        }
        else
            System.out.println("number is not friendly");
    }

    
}
