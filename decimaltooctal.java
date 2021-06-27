import java.util.*;
public class decimaltooctal 
{
    public static void main(String[] k)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int d=s.nextInt();
        int n=0;
        int i=1;
        while(d!=0)
        {
            n+=(d%8)*i;
            d/=8;
            i*=10;
        }
        System.out.println("the ans in octal is:"+d +n);
    }
    
}
