package Thread_Extends;
public class A extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A class Thread is running " + i);
            }
        } catch (Exception e) {
            System.out.println("Found the exception " + e);
        }
    }

}
