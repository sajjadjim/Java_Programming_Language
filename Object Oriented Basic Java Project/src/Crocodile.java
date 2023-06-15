public class Crocodile extends Animal implements Habits {

    int age;
    String size;

    public Crocodile(String kingdom, int age, String size) {
        super(kingdom);
        this.age = age;
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Kingdom of = " + this.kingdom);
        System.out.println("Crocodile age : " + this.age);
        System.out.println("Crocodile Size : " + this.size);

        Home H = new Home("World");
        H.display();

        running();
        eating();
    }

    @Override
    public void running() {
        System.out.println("Crocodile are stay in water.");
    }

    @Override
    public void eating() {
        System.out.println("Crocodiles are eat fish and meat.");
    }

}
