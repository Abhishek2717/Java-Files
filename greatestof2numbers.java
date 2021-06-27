import java.util.*;
public class greatestof2numbers
{
 public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st integer :   ");
    int a= sc.nextInt();
    
    System.out.println();
    
    System.out.print("Enter 2nd integer :   ");
    int b= sc.nextInt();
    int c=a+b;
    System.out.print("the sum of numbers is : ");
    System.out.println(c);
    int i;
    if(a>b)
    {
        System.out.println(a+ " is greater");
    }
    else {
        System.out.println(b+ " is greater");
    }
}
}