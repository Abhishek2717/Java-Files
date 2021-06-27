interface abc
{
    void show();
}
class abhi implements abc
{
    public void show();
    {
        System.out.println("in show");
    }
}
public class interface 
{
    public static void main(String[] args)
    {
        abc obj=new abhi();
        obj.show();
    }
    
}
