import java.util.*;
class area
{
    static void square()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the sides of square:");
        int m=s.nextInt();
        int a=m*m;
        System.out.println("the area of square is:"+a);
    }
    static void rectangle()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        int l=s.nextInt();
        int b=s.nextInt();
        int a=l*b;
        System.out.println("the area of rectangle is:"+a);
    }
    static void triangle()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the base and height of a triangle :");
        int b=s.nextInt();
        int h=s.nextInt();
        int a=(b*h)/2;
        System.out.println("the area of traingle is:"+a);

    }

}
class perimeter
{
    static void square()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the sides of square:");
        int m=s.nextInt();
        int a=4*m;
        System.out.println("the perimeter of square is:"+a);
    }
    static void rectangle()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        int l=s.nextInt();
        int b=s.nextInt();
        int a=2*(l+b);
        System.out.println("the perimeter of rectangle is:"+a);
    }
    static void triangle()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle :");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int p=a+b+c;
        System.out.println("the perimeter of traingle is:"+p);

    }

}
class square
{
    static void square()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int a=n*n;
        System.out.println("the square of "+n+" is "+a);
    }

}
class squareroot
{
    static void squareroot()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        double a=Math.sqrt(n);
        System.out.println("the square root of "+n+" is "+a);
    }

    
}

public class testinheritance
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("User Menu");
        System.out.println("Enter your choice(1-4):"); 
        System.out.println("1.Area\n2.Perimeter\n3.Square\n4.Squareroot");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            area ab=new area();
            System.out.println("enter your choice(1-3):");
            System.out.println("1.Square\n2.Reactangle\n3.Traiangle");
            int ay=s.nextInt();
            switch(ay)
            {
                case 1:
                ab.square();
                break;
                case 2:
                ab.rectangle();
                break;
                case 3:
                ab.triangle();
                break;
                default:System.out.println("!!!!!Invalid Choice!!!!");
            }
            break;
            case 2:
            perimeter ak=new perimeter();
            System.out.println("enter your choice(1-3):");
            System.out.println("1.Square\n2.Reactangle\n3.Traiangle");
            int ayu=s.nextInt();
            switch(ayu)
            {
                case 1:
                ak.square();
                break;
                case 2:
                ak.rectangle();
                break;
                case 3:
                ak.triangle();
                break;
                default:System.out.println("!!!!!Invalid Choice!!!!");
            }
            break;
            case 3:
            square aks=new square();
            aks.square();   
            break;
            case 4:
            squareroot aksh=new squareroot();
            aksh.squareroot();
            break;
            default:System.out.println("!!!!!Invalid Choice!!!!");
            
            
        }
    }
}