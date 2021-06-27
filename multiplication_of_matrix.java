import java.util.*;
public class multiplication_of_matrix 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows and coloums:");
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][] = new int[10][10];
        System.out.println("enter the elements of matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Printing matrix....");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }
        
    }
}