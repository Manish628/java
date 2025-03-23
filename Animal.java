class Animal
{
 Animal()
{
System.out.println("Hello");
}
Animal(int k)
{
System.out.println(k);
}
Animal(int j,String s)
{
System.out.println(j);
System.out.println(s);
}
}
class Child extends Animal
{
Child()
{
super();
System.out.println("child");
}
Child(int j)
{
this();
System.out.println(j);
}
Child(int s,String d)
{
super();
System.out.println(s);
System.out.println(d);
}
public static void main(String args[])
{
Child c1=new Child();
Child c2=new Child(20);
Child c3=new Child(30,"abc");
}
}