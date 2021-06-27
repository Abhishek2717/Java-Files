import java.util.*;

import javax.lang.model.util.ElementScanner6;
class perfectsquare 
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        double b=Math.sqrt(n);
        if(b - Math.floor(b) == 0)
        System.out.println(b+"\nThe no is perfect equare");
        else
        System.out.println(b+"\nThe no is not perfect square");
        
        
    }
    
}
