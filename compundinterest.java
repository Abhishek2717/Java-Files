import java.util.*;
public class compundinterest
{
    public static void main(String [] k)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the princial Amount:");
        float p=s.nextFloat();
        System.out.println("enter the rate of interest:");
        float r=s.nextFloat();
        System.out.println("enter the time taken:");
        float t=s.nextFloat();
        System.out.println("enter the no of time that interest is compunded per unit time:");
        float n=s.nextFloat();
        float B=(1+(r/n));
        float C=n*t;
        double A=p*Math.pow(B,C);
        double D=A-p;
        System.out.println("the compoudn interest is:"+D);
    }
    
}
