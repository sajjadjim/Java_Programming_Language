package E_Output;
public class Test
{
public static void main(String[] args)
{
try
{
System.out.printf(" 1 ");
int sum = 9 / 0;
System.out.printf(" 2 ");
}
catch(ArithmeticException e)
{
System.out.printf(" 3 ");
}
catch(Exception e)
{
System.out.printf(" 4 ");
}
finally
{
System.out.printf(" 5 ");
}
}
}
