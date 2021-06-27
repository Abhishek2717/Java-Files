class test2
{
 public static void main(String []args)
{
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c=a+b;
    System.out.println(c);
    int i;
    if(a>b)
    {
        System.out.println(a+"is greater");
    }
    else {
        System.out.println(b+"is greater");
    }
    for(i=0;i<9;i++)
    {
        System.out.print(i+" ");
    } 
    System.out.println();
    while(i!=0)
    {
        System.out.print(i+ " ");
        i--;
    }
    System.out.println();
    do
    {
        System.out.println(i);
    }while(i!=0);
}
}