
package Abstract;

public class Main {
    public static void main(String[] args) {
        Human H1 = new Human() {};
        Bird B1 = new Bird(){};
        H1.Eat();
        H1.Move();
        H1.Talk();
}
}
