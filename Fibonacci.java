class Fibonacci
{
public static void main(String args[])
{
int d=Integer.parseInt(args[0]);

System.out.println("Enter the last no from which fibonacci series end" + d);
int a=0;int b=1; int c=0;
System.out.println(a);
System.out.println(b);
for(int i=1;i<=d;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
