import java.util.Scanner;
public class circumferenceofcircle
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    double radius = sc.nextDouble();
    double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}