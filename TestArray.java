class TestArray
{
public static void main(String args[])
{
System.out.println("Enter the number for you want to calculate average"); 
 int A[]={10, 20, 30, 40, 50 };
for(int i=0;i<A.length;i++)
{
System.out.println(A[i]+" ");
}
float sum=0, avg;
for(int  i=0;i<A.length;i++)
sum+=A[i];
avg= sum/A.length;
System.out.println("Average =" + avg);
}
}