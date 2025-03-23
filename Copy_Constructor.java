class Copy_Constructor
{
int i;
String j;
Copy_Constructor(int a,String b)
{
i=a;
j=b;
System.out.println(i);
System.out.println(j);
}
Copy_Constructor(Copy_Constructor s)
{
a=s.i;
b=s.j;
}

public static void main(String args[])
{
Copy_Constructor z1=new Copy_Constructor(20,"Hello");
Copy_Constructor z2=new Copy_Constructor(z1);
z1.m();
z2.m();
public static void m()
{
System.out.printl(z1.i);
System.out.println(z2.i);
System.out.println(z1.j);
System.out.println(z2.j);
}


}
}
