class constructor 
{
    int id;
    String name;
    Student(int i,String n)
    {
        id=i;
        name=n;
    }
void display()
{
    System.out.println(id+" "+name);
}

    public static void main(String[] args)
    {
        Constructor s2=new Constructor(14,"Ayushi");
        s1.display();
        s2.display();
    }
    
}
