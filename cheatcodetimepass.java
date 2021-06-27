import java.util.*;
interface abhi
{
    void srish();
    void panda();
    void udita();
}
abstract class srishti implements abhi
{
    void srish()
    {
        System.out.println("cutest girl");
    }
    void panda()
    {
        System.out.println("my bestii and best from everyone");
    }
}
class akanksha extends srishti
{
    void timepass()
    {
    System.out.println("connect all the contents:");
    }
}
class pankajsir
{
    void java()
    {
        System.out.println("the method called sucessfully");
    }
}
class Riya
{
    void riya()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("busiest girl");
        System.out.println("enter both the method");
        int ab=a.nextInt();
        int b=a.nextInt();
        int c=ab*b;
        System.out.println("the result of both the methods are:"+c);
    }
}
class Pargii
{
    void udita()
    {
        System.out.println("the cutest but dont reply on time");

    }
}
 class cheatcodetimepass 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("let's enter the fucking timepass menu:");
        System.out.println("1.Akanksha Gupta");
        System.out.println("2.Srishti Verma");
        System.out.println("3.Pargii bhatt");
        System.out.println("4.Riya Dhablania");
        System.out.println("5.Pankaj Sir");
        int ch=s.nextInt();
        switch(ch)
        {
        case 1:
        abhi abc=new akanksha();
        abc.srish();
        abc.panda();
        break;
        case 3:
        Pargii abcd=new Pargii();
        abcd.udita();
        break;
        case 4:
        Riya abk=new Riya();
        abk.riya();
        break;
        case 5:
        pankajsir jav=new pankajsir();
        jav.java();
        break;
        default:System.out.println("!!!! Invalid choice !!!!");
        }

    
    }
    
}
