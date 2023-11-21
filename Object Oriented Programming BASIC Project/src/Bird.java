public class Bird extends Animal implements Habits  {  

    String name;

    public Bird(String kingdom, String name) {
        super(kingdom);
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Kingdom of Bird = " + this.kingdom);
        System.out.println("Bird Name : " + this.name);

        Home H = new Home("World");
        H.display();

        running();
        eating();
    }

    @Override
    public void running() {
        System.out.println("Birds can Fly.");
    }

    @Override
    public void eating() {
        System.out.println("Birds are eat insects.");
    }

}
 


