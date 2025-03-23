class Parentf
{
final static void m1()
{
System.out.println("Hello java");
}
}
class Child extends Parent
{
public static void main(String args[])
{
m1();
final  int i=10;
 i=20;
System.out.println(i);

}
static void m1()
{
System.out.println("Hello Manish");
}
}