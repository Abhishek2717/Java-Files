import java.util.*;
public class patternques1 
{
    public static void main( String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows:");
        int m=s.nextInt();
        System.out.println("enter the no of coloums:");
        int n=s.nextInt();
        for(int i=0;i<m;i--)
        {
            for(int j=0;j>i;j--)
            {
                System.out.print("*"); 
            }
            System.out.println(" ");
        }

    }
    
}
