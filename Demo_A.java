class Demo_A
{
int a=20;int b=2; int c=0;
public static void main(String args[])
{
Demo_A a=new Demo_A();
a.sum();
}
void sum()
{
c=a+b;
System.out.println("Sum =" + c);
}
}
class Demo_B
{
int a=40; int b=8; int c=0;
public static void main(String args[])
{
Demo_B b=new Demo_B();
b.subtract();
}
void subtract()
{
c=a-b;
System.out.println("Subtract =" + c);
}
}
