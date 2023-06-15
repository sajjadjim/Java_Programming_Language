package E_Output;
public class Test4
{
public static void main(String[] args)
{
try
{
System.out.printf("1");
int data = 5 / 0;
}
catch(ArithmeticException e)
{
System.out.printf(" 2 ");
System.exit(0); // System is end Here 
}
finally
{
System.out.printf(" 3 ");
}
System.out.printf(" 4 ");
}
}
