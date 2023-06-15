package Thread_Extends;

public class B {

    public static void main(String[] args) {
        A thr = new A();
        
      //  Thread t = new Thread(thr);
      // t.start();
      
        thr.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B class Thread is running " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
