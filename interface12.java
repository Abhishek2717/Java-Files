interface abc
{
    void show();
}
abstract class A
{
void get()
{
System.out.println("in show sir ");
}
}
class abhi extends A implements abc
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class interface12
{
    public static void main(String[] args)
    {
        abc obj=new abhi();
        obj.show();
    }
    
}
