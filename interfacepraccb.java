interface myinterface
{
    int x=10;
    void f1();
    void f2();
}
abstract class A implements myinterface
{
    public void f1()
    {
        System.out.println("pankaj sir is absent");
    }
}
class B extends A
{
    public void f2()
    {
        System.out.println("print the first one");
    }

}
 class interfacepraccb 
{
    public static void main(String[] args)
    {
        myinterface b=new B();
        b.f2();
        System.out.println(b.x);
    }
    
}
