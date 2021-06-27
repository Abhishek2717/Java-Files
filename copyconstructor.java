 class cr
{
    int id;
    String name;
    copyconstructor(int i,String n)
    {
        id=i;
        name=n;
    }
    /* copyconstructor(copyconstructor  s)
    {
        id=s.id;
        name=s.name;
    } */
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args)
    {
        cr s1=new cr(2717,"Abhishek");
        
        s1.display();
        
    }
    
}
