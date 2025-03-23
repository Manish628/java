class Demo_Arithematic
{ 
int a=100;int b=50;int c=0;
public static void main(String args[])
{
Demo_Arithematic a=new Demo_Arithematic();
a.sum();
a.subtract();
a.multiply();
a.divide();
}
void sum()
{
c=a+b;
System.out.println("Sum =" +c);
}
void subtract()
{
c=a-b;
System.out.println("Subtract =" + c);
}
void multiply()
{
c=a*b;
System.out.println("Multiply =" + c);
}
void divide()
{
c=a/b;
System.out.println("Divide =" + c);
}
}