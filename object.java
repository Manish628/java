class object
{
public static int count =0;

  public object()
{
count++;
} 
public static void disp()
{
System.out.println(count);
}
public static void main(String args[])
{
object obj1=new object();
object obj2=new object();
object obj3=new object();
object obj4=new object();
disp();
}
}
