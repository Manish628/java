class Demo_vote
{
public static void main(String args[])
{
  int i=Integer.parseInt(args[0]);
  if(i<=18)
{
System.out.println("You are eligible to vote");
}
else
{
System.out.println("You are not eligible to vote");
}
}
}