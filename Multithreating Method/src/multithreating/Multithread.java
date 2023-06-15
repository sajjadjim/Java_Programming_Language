package multithreating;

// Main Class
public class Multithread {
    public static void main(String[] args)
    {
             MultithreadingDemo object = new MultithreadingDemo();
            object.start();
            
        int n = 4; // Number of threads
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}   

