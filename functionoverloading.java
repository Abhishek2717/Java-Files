import java.util.*;
class area
{
    static void square()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int s=s.nextInt();
        float a=s*s;
        System.out.println("the area of square is:"+a);
    } 
    static void rectangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length:");
        int l=s.nextInt();
        System.out.println("enter the breadth:");
        int b=s.nextInt();
        float a=l*b;
        System.out.println("the area of rectangle is:"+a);
    }
    static void triangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the base:");
        int b=s.nextInt();
        System.out.println("enter the height:");
        int h=s.nextInt();
        float a=(b*h)/2;
        System.out.println("the area of rectangle is:"+a);
    }
}

class perimeter
{
    static void square()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int s=s.nextInt();
        float p=4*s;
        System.out.println("the perimeter of square is:"+p);
    } 
    static void rectangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length:");
        int l=s.nextInt();
        System.out.println("enter the breadth:");
        int b=s.nextInt();
        float p=4*(l*b);
        System.out.println("the perimeter of rectangle is:"+p);
    }
    static void triangle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first side:");
        int a=s.nextInt();
        System.out.println("enter the second side:");
        int b=s.nextInt();
        System.out.println("enter the third side:");
        int c=s.nextInt();
        float p=a+b+c;;
        System.out.println("the perimeter of triangle is:"+p);
    }
}
class square
{
    static void square() 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the side:");
        int n=s.nextInt();
        float a=n*n;
        System.out.println("the square of "+n+" is" +a);
    }
}
class squareroot
{
    static void squareroot()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        double a= Math.sqrt(n);
        System.out.println("the squareroot of "+n+" is "+a);
    }
}
public class functionoverloading 
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Area\n2.Perimeter\n3.Square\n4.Squareroot");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            area ab=new area();
            System.out.println("enter your choice:\n");
            System.out.println("1.square\n 2. rectangle\n 3.triangle\n");
            int ay=s.nextInt();
            switch(ay)
            {
                case 1:
                ab.square();
                case 2:
                ab.rectangle();
                break;
                case 3:
                ab.triangle();
                break;
                default:System.out.println("!!Invalid Choice Try Again!!");
            }
            break;
            case 2:
            perimeter abh=new perimeter();
            System.out.println("enter your choice:\n");
            System.out.println("1.square\n 2. rectangle\n 3.triangle\n");
            int hm=s.nextInt();
            switch(hm)
            {
                case 1:
                abh.square();
                break;
                case 2:
                abh.rectangle();
                break;
                case 3:
                abh.triangle();
                default: System.out.println("!!Invalid Choice Try Again!!");
            }
            break;
            case 3:
            square ayu= new square();
            ayu.square();
            break;
            case 4:
            squareroot zx=new squareroot();
            zx.squareroot();
            break;
            default: System.out.println("!!Invalid Choice Try Again!!");

        }


    }
    
}
