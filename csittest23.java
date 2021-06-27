import java.util.*;
class base{
    abstract void fun();
}
class derived extends base{
    void fun()
    {
        System.out.println("call the derived funtion:");
    }
}
public class csittest23 
{
    public static void main(String[] args)
    {
        derived d= new derived();
        d.fun();



    }
    
}
