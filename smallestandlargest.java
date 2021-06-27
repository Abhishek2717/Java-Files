import java.util.*;
public class smallestandlargest 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enetr the no of elements in an array");
        int n=s.nextInt();
        int a[] = new int[n];
        System.out.println("enetr the numebrs:");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int large=a[0];
        int small=a[0];
        for(int i=1;i<a.length;i++)
           if(a[i]<small)
            small=a[i];
           
        else if(a[i]>large)
                    large=a[i];
        System.out.println("the smallest numerb is:"+small);
        System.out.println("the largest numebr is:"+large);  
    }
}
