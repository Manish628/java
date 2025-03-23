class Method_Overloading
{
public void a_m()
{
System.out.println("hello");
}
public void eat()
{
System.out.println("Manish");
}
}
 class Child extends Method_Overloading
{
public void h_m()
{
System.out.println("kumar");
}
public void eat()
{
System.out.println("Good");
}
}
class Test 
{
public static void main(String args[])
{
Method_Overloading a=new Method_Overloading();
a.a_m();
a.eat();
//a.h_m();
Child c=new Child();
c.a_m();
c.eat();
c.h_m();
Method_Overloading z=new Child();
z.a_m();
z.eat();
//z.h_m();
/*Child d= new Method_Overloading();
d.a_m();
d.eat();
d.h_m();*/
}
}