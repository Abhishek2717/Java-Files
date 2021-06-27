import java.util.*;
public class areaofcircle 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    double radius = sc.nextDouble();
    double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
   }

    
}
