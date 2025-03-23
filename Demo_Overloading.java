class Demo_Overloading
{
void show()
{
System.out.println("Hello");
}
}
class Overriding extends Demo_Overloading
{
void show()
{
System.out.println("Manish");
}
void show(int a)
{
System.out.println(a);
}
public static void main(String args[])
{
Overriding d=new Overriding();
d.show();
d.show(10);
}
}