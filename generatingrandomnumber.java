import java.util.*;
public class generatingrandomnumber 
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        Random r= new Random();
        System.out.println("Random Numbers are:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("the random numbers are"+r.nextInt(200));
        }
    }
    
}
