import java.util.*;
public class areaoftraingle 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the base:");
        int b=s.nextInt();
        System.out.println("enter the height:");
        int h=s.nextInt();
        int a=(b*h)/2;
        System.out.println("the area of triangle is:"+a);
    }
    
}
