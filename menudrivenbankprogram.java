import java.util.*;
public class menudrivenbankprogram 
{
    public static void main(String[] args)
    {
        float p,r,t;
        Scanner s = new Scanner(System.in);
        System.out.println("User Menu:\n");
        System.out.println("1.Term deposits:");
        System.out.println("2.Recurring deposits:");
        System.out.println("Enter your choice:");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
            {
                System.out.println("enter the principal value:");
                 p= s.nextFloat();
                System.out.println("enter the rate of interest:");
                r=s.nextFloat();
                System.out.println("enter the time taken:");
                 t=s.nextFloat();
                double a= 1+(r/100);
                double A=p*(Math.pow(a,t));
                System.out.println("Maturity amount:"+A);
            } 
            break;
            case 2:
            {
                System.out.println("enter the monthly installment:");
                p=s.nextFloat();
                System.out.println("enter rate of interest:");
                r=s.nextFloat();
                System.out.println("ente the time in years:");
                t=s.nextFloat();
                double a=(r/100)*(1/12);
                double b=(t*(t+1)/2)*a;
                double A=(p*t)+(p*b);
                System.out.println("Maturity amount:"+A);
            }
            break;
            default:System.out.println("Wrong choice:");
        }

    }
    
}
