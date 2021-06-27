import java.util.*;
abstract class area
{   
    static void square()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        double a=n*n;
        System.out.println("the area of square is:"+a);
    }
    static void rectangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length:");
        int l=s.nextInt();
        System.out.println("enter the breadth:");
        int b=s.nextInt();
        double a=l*b;
        System.out.println("the area of rectangle is:"+a);
    }
    static void triangle()
    {
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the base:");
            int b=s.nextInt();
            System.out.println("enter the height:");
            int h=s.nextInt();
            double a=b*h;
            System.out.println("the area of triangle is:"+a);
        } 
    }
    
}
class addition
{
    static void add()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        float c=a+b;
        System.out.println("the sum is:"+c);
    }    
}
class Substraction
{
    static void substract()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        float c=a-b;
        System.out.println("the substraction is:"+c);
    }
}
class multiplication
{
    static void multiply()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        float c=a*b;
        System.out.println("the multiplication is:"+c);
    }
}
public class singleinheritance 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your choice:");
        System.out.println("1.Addition"); 
        System.out.println("2.Area");
        System.out.println("3.Substraction");
        System.out.println("4.Multiplication");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            addition my=new addition();
            my.add();
            break; 
            case 2:
            area abh = new area();
            {
            System.out.println("enter your choice:");
            System.out.println("1. square\n 2. rectangle\n 3. traingle");
            int ab=s.nextInt();
            switch(ab)
                {
                case 1:
                System.out.println("for square:");
                abh.square();
                break;
                case 2:
                System.out.println("for rectangle:");
                abh.rectangle();
                break;
                case 3:
                System.out.println("for triangle:");
                abh.triangle();
                default:System.out.println("invalid choice");
                }
            }
            break;
            case 3:
            Substraction abhi=new Substraction();
            abhi.substract();
            break;
            case 4:
            multiplication aky=new multiplication();
            aky.multiply();
            break;
            default:System.out.println("Invalid choice:");


        }
    }
    
}
