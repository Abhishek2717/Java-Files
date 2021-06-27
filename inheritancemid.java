//Demonstrate the inheritance concept by individual program
import java.util.*;
class abhi 
{
    void riya()
    {
        System.out.println("the cutest girl of class");
    }
}
class area extends abhi
{
    Scanner a=new Scanner(System.in);
    void square()
    {
        System.out.println("enter the sides of square:");
        int s=a.nextInt();
        int b=s*s;
        System.out.println("the area of square is:"+b);
        
    }
    void rectangle()
    {
        System.out.println("enter the length and breadth of square:");
        int l=a.nextInt();
        int b=a.nextInt();
        int c=l*b;
        System.out.println("the area of square is:"+c);
        
    }
}

public class inheritancemid
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("User Menu:");
        System.out.println("1.Area");
        System.out.println("2.Rectangle");
        int ch=s.nextInt();
        switch(ch)
        {
        case 1:
        area abh=new area();
        abh.riya();
        abh.square();
        abh.rectangle();
        }
    }
}