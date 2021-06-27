import java.util.*;
public class armstrongbetweentwonumbers 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first and last number:");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<b;i++)
        {
            int check,rem,sum=0;
            check=i;
            while(check!=0)
            {
                rem=check%10;
                sum=sum+(rem*rem*rem);
                check=check/10;
            }
            if(sum==i)
            {
                System.out.println("The armstrong numbers is:"+i);
            }
        }
    }
    
}
