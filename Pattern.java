import java.util.*;
class Pattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no For which you want to write the patteren : ");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
 for(int j=0;j<i;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
for(int i=n-1;i>0;i--)
{
  for(int j=i;j>0;j--)
{
System.out.print(i);
}
System.out.println("  ");
}

}
}
