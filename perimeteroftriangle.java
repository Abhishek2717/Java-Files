import java.util.*;
public class perimeteroftriangle 
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the first side:");
        int a=s.nextInt();
        System.out.println("enter the second side:");
        int b=s.nextInt();
        System.out.println("enter the third side:");
        int c=s.nextInt();
        float p=a+b+c;;
        System.out.println("the perimeter of traingle is:"+p);
    }
    
}
