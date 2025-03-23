abstract class Vehicle
{
abstract void wheel();
void seat()
{
System.out.println("No of seat");
}
}
class Bike extends Vehicle
{
public static void main(String args[])
{
Bike b=new Bike();
b.seat();
b.wheel();
}
void wheel()
{
System.out.println("two wheels");
}
}