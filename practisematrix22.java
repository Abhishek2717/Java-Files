import java.util.*;
public class practisematrix22 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of rows and coloumns:");
        int r=s.nextInt();
        int c=s.nextInt();
        System.out.println("Enter the elements of first matrix:");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int b[][]=new int[r][c];
        System.out.println("Enter the matrix of second matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        int p[][]=new int[r][c];
        System.out.println("The resultant matrix after multiplication is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<c;k++)
                {
                    p[i][j]+=a[i][k]+b[k][j];
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
