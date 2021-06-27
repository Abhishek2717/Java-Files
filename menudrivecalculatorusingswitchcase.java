import java.util.*;
public class menudrivecalculatorusingswitchcase
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your choice between (1-4):");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multipication");
        System.out.println("4.Division");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter two number:");
            int a=s.nextInt();
            int b=s.nextInt();
            float c=a+b;
            System.out.println("The Sum is: "+c);
            break;
            case 2:
            System.out.println("Enter two number:");
             a=s.nextInt();
             b=s.nextInt();
             c=a-b;
            System.out.println("The substraction is: "+c);
            break;
            case 3:
            System.out.println("Enter two number:");
             a=s.nextInt();
             b=s.nextInt();
             c=a*b;
            System.out.println("The Multiplication is: "+c);
            break;
            case 4:
            System.out.println("Enter two number:");
             a=s.nextInt();
             b=s.nextInt();
             c=a/b;
            System.out.println("The division is: "+c);
            break;
            default:System.out.println("Invalid choice");
        }

    }
}