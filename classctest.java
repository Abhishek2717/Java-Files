
class A
{
    int a;
    A(int p)
    {
        a=p;
    }
    void disp1()
    {
        System.out.print("mayank bhai will pass mid sem"+a);
    }
}
class B extends A
{
    int b;
    B(int p,int t1)
    {
        super(p);
        b=t1;
    }
    void disp2()
    {
        System.out.println("\nmidsem will be online"+b);
    }
}
public class classctest extends B
{
    int d;
    classctest(int p,int t1,int t2)
    {
        super (p,t1);
        d=t2;
    }
    void disp3()
    {

        System.out.println("pankaj sir is the worst cc="+d);
    }
    public static void main(String[] k)
    {
        classctest t1=new classctest(10,20,30);
        t1.disp1();
        t1.disp2();
        t1.disp3();
    }

}
