class Demo_Inheritance
{
int a=30; int b=3; int c=0;
public static void main(String args[])
{
Demo_Inheritance d=new Demo_Inheritance();
d.sum();
}
void sum()
{
c=a+b;
System.out.println("Sum =" + c);
}
}
class Demo extends Demo_Inheritance
{
public static void main(String args[])
{
Demo a=new Demo();
a.subtract();
a.sum();
}
void subtract()
{
c=a-b;
System.out.println("Subtract =" + c);
}
}