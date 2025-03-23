class Overridding
{
public void eat()
{
System.out.println("Hello");
}
}
class Show extends Overridding
{
public void eat()
{
System.out.println("Manish");
}
public static void main(String args[])
{
Show s=new Show();
s.eat();
Overridding a=new Overridding();
a.eat();
//Show t=new Overridding();
//t.eat();
Overridding q=new Show();
q.eat();
}
}
