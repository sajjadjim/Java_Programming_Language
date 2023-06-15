package multithreating;

class MultithreadingDemo extends Thread {

    public void run() {
        try {
            // Displaying the thread that is running
            for (int i = 0; i < 5; i++) {

                System.out.println("Thread " + i + " is running");
            }
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
