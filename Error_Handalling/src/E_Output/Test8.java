package E_Output;
public class Test8 {
  public static void main(String args[]) {
      
try {
int d = 0;
int n = 20;
int fraction = n / d;  // Error 
int g[] = { 1 };
g[20] = 100;
}

catch (ArithmeticException e) {   // This section
System.out.println("ArithmeticException ");
}

catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBounds");
}

System.out.println("End Of Main");

}  
}
