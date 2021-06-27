import java.util.*;
public class leapyear2 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year:");
        int y=s.nextInt();
        boolean isleap=false;
        if(y%4==0)
        {
            if(y%100==0)
            {
                if(y%400==0)
                {
                    isleap=true;
                }
                    else
                    isleap=false;
            }
                else
                    isleap=true;
            }
            else 
            isleap=false;
        
        if(isleap==true)
        {
            System.out.println("the year is a leap year");
        }
        else
        System.out.println("the year is not a leap year");

    }
    
}
