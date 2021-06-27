import java.util.*;
public class perfectsquarerootsecondmethod
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no:");
        int n=s.nextInt();
        double x=Math.sqrt(n);
        if(Math.sqrt(n)==(int)Math.sqrt(n))

        System.out.println(x+"\nThe num is a perfect squareroot");
        else 
        System.out.println(x+"\nThe num is not a perfect squareroot");
    }
    
}
