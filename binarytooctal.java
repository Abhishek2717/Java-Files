import java.util.*;
public class binarytooctal 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        long b=s.nextLong();
        int o=0;
        int d=0;
        int i=0;
        while(b!=0)
        {
            d+=(b%10)*Math.pow(2,i);
            ++i;
            b/=10;
        }
        i=1;
        while(d!=0)
        {
            o+=(d%8)*i;
            d/=8;
            i+=10;
        }
        System.out.println("the ans in octal is:"+b +o);

    
    
    }
    
}
