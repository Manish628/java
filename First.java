interface First
{
public abstract void m1();
}
interface Second
{
public abstract void m2();
}
interface Four
{
public abstract void m3();
}

class Third implements First,Second,Four
{
public static void main(String args[])
{
Third a=new Third();
a.m1();
a.m2();
a.m3();
}
public void m1()
{
System.out.println("Hello First");
}
public void m2()
{
System.out.println("Hello Second");
}
public void m3()
{
System.out.println("Hello Four");
}
}