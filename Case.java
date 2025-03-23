import java.util.*;
class Case
{
public static void  main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a :");

int a=sc.nextInt();
System.out.println("Enter the value of b :");
int b=sc.nextInt();
System.out.println("Enter the case :");
int n=sc.nextInt();

switch(n)
{
case 1: int c=a+b;
             System.out.println("Sum of a and b is : " +c);
             break;
case 2:int d=a-b;
            System.out.println("Subtract of a and b is : " +d);
           break;
case 3: int e=a*b;
            System.out.println("Multiply of a and b is : " +e);
           break;
case 4:int f=a%b;
            System.out.println("Divide of a and b is : " +f);
            break;
case 5: int g=a/b;
            System.out.println("Modulo of a and b is : " +g);
            break;
default:
            System.out.println("Enter valid case :");
}
}
}


