import java.util.*;
public class stringconcate 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str,str1;
        System.out.print("enter the string:");
         str=s.nextLine();
        int n,i,j,c=0;
         n=str.length();
        // for(i=n;i>=0;i--,j++)
         str1=str.substring(0,n);
        for( i=0,j=n;i<n;i++,j--)
        {
            if(str.charAt(i)!=str1.charAt(j))
            {
                c++;
                break;
            }
            else;
            if(c==0)
            System.out.println("String is palindrone:");
            else
            System.out.println("String is not palindrome:");

        }
    }
    
}
