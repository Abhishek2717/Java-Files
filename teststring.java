import java.util.*;
public class teststring 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str,str1;
        System.out.println("enter the string:");
        str = s.nextLine();
        int c=0;
        int n=str.length();
        str1=str.substring(0,n);
        for(int i=0,j=n;i<n;i++,j--)
        {
            if(str.charAt(i)!=str1.charAt(j))
            {
                c++;
                break;
            }
            else;
            if(c==0)
            System.out.println("String is a palindrome");
            else
            System.out.println("String is not a palindrome");
        }
    }
    
}
