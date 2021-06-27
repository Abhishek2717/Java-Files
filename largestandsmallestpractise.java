import java.util.*;
public class largestandsmallestpractise 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enetr the numbers of elements in an array:");
        int a=s.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        int large=b[0];
        int small=b[0];
        for(int i=1;i<b.length;i++)
        if(b[i]<small)
            small=b[i];
            else 
            large=b[i];
            System.out.println("the largest numner is"+large);
            System.out.println("the smallest numner is"+small);

    }
    
}
