package Problem27;
public class ExceptionPropagationExample {

    public static void main(String[] args) {
        try {
            method1();
            
        } 
        catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());  // Never Print
        }
    }

    public static void method1() {
        try {
            method2();
        } 
        
        catch (Exception e) {
            System.out.println("Exception caught in method1: "  + e.getMessage());
            throw e;
        }
    }

    public static void method2() {
        try {
            int result = divide(10, 0);

            System.out.println("Result: " + result);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Exception caught in method2: "  + e.getMessage());  // print
            
            throw new RuntimeException("Custom exception message");
        }
    }

    public static int divide(int numerator, int denominator) {
        
        return numerator / denominator;
        
    }
}
