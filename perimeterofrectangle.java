import java.util.*;
public class perimeterofrectangle
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the length");
    int l=s.nextInt();
    System.out.println("enter the breadth:");
    int b=s.nextInt();
    float p=4*(l*b);
    System.out.println("the perimeter of rectangle is:"+p);
    }
}