import java.util.*;
public class csittest 
{   
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows:");
        int m=s.nextInt();
        System.out.println("enter the no of coloumns:");
        int n=s.nextInt();
        int a[][]=new int[100][100];
        System.out.println("enter the elements:");
       for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                 a[m][n]=s.nextInt();   
            }
        }
        
        double sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            a[m][n] = s.nextInt();
             sum=sum+a[m][n];
        }
        System.out.println(" the updated value of a is:"+sum);
         sum=Math.sqrt(sum);
        System.out.println("sum is:"+sum);
    
    }
}
