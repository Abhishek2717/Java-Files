import java.util.*;
class area
{
    static void square()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the sides:");
        int n=s.nextInt();
        int a=n*n;
        System.out.println("area of square is:"+a);
    }
    static void rectangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length and breadth");
        int l=s.nextInt();
        int b=s.nextInt();
        int a=l*b;
        System.out.println("area of rectangle is:"+a);

    }
    static void triangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the base and height");
        int b=s.nextInt();
        int h=s.nextInt();
        int a=(b*h)/2;
        System.out.println("area of triangle is:"+a);

    }
}
class perimeter
{
    static void square()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the sides of square:");
        int n=s.nextInt();
        int p=4*n;
        System.out.println("area of square is:"+p);

    }
    static void rectangle()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the length and breadth");
        int l=s.nextInt();
        int b=s.nextInt();
        int p=2*(l+b);
        System.out.println("area of rectangle is:"+a);

    }

}
public class inheritancetest 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("User menu:");
        System.out.println("1.Area\n 2.Perimeter\n 3.Square\n 4.Squareroot");
        int ch=nextInt();
        switch(ch)
        {
            case 1:

        }

    }
    
}
