package Problem27;

public class Main {

    public static void main(String[] args) {

        Dog animal1 = new Dog(); // Polymorphism - Dog object treated as Animal

        Cat animal2 = new Cat(); // Polymorphism - Cat object treated as Animal

        animal1.makeSound(); // Calls the overridden method in Dog class 

        animal2.makeSound(); // Calls the overridden method in Cat class

    }
}
