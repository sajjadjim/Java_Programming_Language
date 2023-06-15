package RunnableThread;

public class A implements Runnable {

    @Override
    public void run() {
       try{
           for (int i = 0; i < 5; i++) {
               System.out.println("A class Runnable Thread "+i);
           }
           System.out.println("");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}
