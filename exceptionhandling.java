public class exceptionhandling 
{
    public static void main(String[] args)
    {
        int n1,n2,div;
        n1=5;
        n2=0;
        try{
        div=n1/n2;
        System.out.println("division of numbers are:"+div);
        }
        catch(ArithmeticException b)
        {
            System.out.println("divide by 0 exception");
        }
        System.out.println("after exception:");
    }
    
}
