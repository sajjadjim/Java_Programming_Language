
package E_Output;
public class Test7{
public static void main(String args[]) {
    
try {
int d = 1;
int n = 20;
int fraction = n / d;
int g[] = { 1 };  // Error Found
g[20] = 100;
}

catch (ArithmeticException e) {
System.out.println("ArithmeticException ");
}

catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBounds");
}

System.out.println("End Of Main");

}
}