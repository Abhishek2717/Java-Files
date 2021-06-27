import java.util.*;
public class sumofstringinarray 
{
    public static void main(String[] args)
    {
        int sum=0,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the elements in array:");
         n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter all the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum of elements in an array are:"+sum);

    }
    
}
