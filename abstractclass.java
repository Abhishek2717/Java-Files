abstract class abstractclass 
{
    abstract void abhi();
    {
        System.out.println("masss bunking in the upcoming week");
    }
    
}
class students extends abstractclass
{
    void abhi()
    {
        System.out.println("couz of mid sem notified by cr of the class");
    }
    public static void main(String[] args)
    {
        abstractclass a=new students();
        a.abhi();
    }

}
