import java.util.Scanner;
public class javaarrayprac {

    public static void main(String[] args) 
    {
        Scanner n= new Scanner(System.in);
        System.err.println("enter the first number :");
        int a = n.nextInt();
        System.out.println("enter the second nmber :");
        int b = n.nextInt();
        
        int product= a+b;
        System.err.println("the product is :" +product);
    }


       /* int n;
        float sum=0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the total no of elements :");
        n = s.nextInt();
        int a[]= new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<n;i++) 
        {
            a[i]= s.nextInt();
            sum=a[i]+sum;
        }
        System.out.println("the sum is "+ sum);
        average=(float)sum/n;
        System.out.println("the average is"+average); */
    
}