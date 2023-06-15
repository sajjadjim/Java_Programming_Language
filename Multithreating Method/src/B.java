public class B {
    public static void main(String[] args) {
        
        A obj = new A();
        
        Thread T = new Thread(obj);
        T.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
