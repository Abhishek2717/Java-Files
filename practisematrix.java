import java.util.*;
public class practisematrix 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows and coloums:");
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]= new int[r][c];
        System.out.println("enter the elements of first matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elements of second matrix:");
        int b[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("multiplication matrix of first and second matrix are:");
        int p[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<c;k++)
                {
                    p[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                
                    System.out.print(" "+p[i][j]);
                
            }
            System.out.println(" ");
        }
    }    
}
