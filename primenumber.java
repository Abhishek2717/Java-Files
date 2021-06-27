import java.util.*;
public class primenumber 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the elements:");
        int n=s.nextInt();
        int temp;
        boolean isPrime=true;
        for(int i=2;i<n/2;i++)
        {
            temp=n%i;
	        if(temp==0)
	        {
	            isPrime=false;
	            break;
	        }
        }
        if(isPrime)
	   System.out.println(n+ " is a Prime Number");
	else
	   System.out.println(n+ " is not a Prime Number");
    }
    
}
