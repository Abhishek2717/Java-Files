import java.util.*;
public class printingmatrix 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows and coloums:");
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter the elements of first matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int b[][] = new int[r][c];
        System.out.println("enter the elements of second matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        int p[][]=new int[r][c];
        System.out.println("the matrix Multiplication is:");
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
                    System.out.print(p[i][j]+" ");
            }
            System.out.println(" ");
        }       
    }
}