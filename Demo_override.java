class Demo_override
{
static void m1()
{
System.out.println("Hello java");
}
}
class B extends Demo_override
{
public static void main(String args[])
{
B b=new B();
Demo_override a=new Demo_override();
b.m1();
a.m1();
}
static void m1()
{
System.out.println("Hello Manish");
}
}

   