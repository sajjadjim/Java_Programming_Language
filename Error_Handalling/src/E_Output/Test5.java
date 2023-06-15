
package E_Output;
public class Test5
{
public static void main(String[] args)
{
try
{
System.out.printf(" 1 ");
int data = 5 / 0;
}
catch(NullPointerException e)
{
System.out.printf(" 2 ");
}
finally{
System.out.printf(" 3 ");
}

System.out.printf(" 4 ");

}
}
