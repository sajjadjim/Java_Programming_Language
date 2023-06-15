public class Human extends Animal implements Habits  {  
    int age;
    String weight;

    public Human(String kingdom, int age, String size) {
        super(kingdom);
        this.age = age;
        this.weight = size;
    }

    @Override
    public void display() {
        System.out.println("Kingdom of Human = " + this.kingdom);
        System.out.println("Human age : " + this.age );
        System.out.println("Human  weight : " + this.weight);

        Home H = new Home("World");
        H.display();

        running();
        eating();
    }

    @Override
    public void running() {
        System.out.println("Human can run fast .");
    }

    @Override
    public void eating() {
        System.out.println("All Human are eat halal food.");
    }

}
 

