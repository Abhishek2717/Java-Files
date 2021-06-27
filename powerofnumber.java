import java.util.*;

public class powerofnumber
{
    public static void main(String[] args)
    {
        int p,n;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        System.out.println("enter the power:");
        p=s.nextInt();
        s.close();
        double r=Math.pow(n,p);
        System.out.println("the result is:"+r);


        /* int n;
        float sum=0;
        float average;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the total number of elements :");
        n=s.nextInt();
        int a[]= new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum is "+sum);
        average=sum/n;
          System.out.println("Average is"+average); */
    }
}
