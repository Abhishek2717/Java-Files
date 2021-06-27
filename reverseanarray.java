import java.util.*;
public class reverseanarray
{
    public static void main(String[] args)
    {
        int i=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total no of elements:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements:");
        for( i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int j=0;
        j=i-1;
        i=0;
        s.close();
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("the reversed string is:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}