import java.util.*;
public class midpractisestring 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any String:");
        String a=s.nextLine();
        a=a.toLowerCase();
        int vcount=0;
        int ccount=0;
        int digits=0;
        int specialcharacters=0;
        int spaces=0;
        int even=0;
        int odd=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
                {   
                    vcount++;   

                   if(i%2==0)
                    even++;
                    else 
                    odd++;
                }
                    
            else if(a.charAt(i)>='a'&&a.charAt(i)<='z')
                ccount++;
            else if(a.charAt(i)>='0'&&a.charAt(i)<='9')
                digits++;
            else if(a.charAt(i)==' ')
                spaces++;
            else
                specialcharacters++;
        }
        System.out.println("the string is:"+a);
        System.out.println("the numebr of even vowels are:"+even);
        System.out.println("the numebr of odd vowels are:"+odd);
        System.out.println("the numebr of  vowels are:"+vcount);
        System.out.println("the digits is:"+digits);
        System.out.println("the spaces is:"+spaces);
        System.out.println("the specail is:"+specialcharacters);
        System.out.println("the numebr of consonants are:"+ccount);

    }
    
}