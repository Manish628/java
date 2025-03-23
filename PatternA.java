import java.util.*;
class PatternA
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for which you want to print triangle :");
int n=sc.nextInt();

for(i=n;i>=1;i--)
{
for(j=i+1;j>1;j--)
{
System.out.print(i);
}
System.out.println("  ");
}
}
}