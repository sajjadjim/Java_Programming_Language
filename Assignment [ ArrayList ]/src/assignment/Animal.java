package assignment;

public class Animal {

    String name;
    int age;
    String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public void display() {

        System.out.println(" Name: " + this.name);
        System.out.println(" Age: " + this.age);
        System.out.println(" Food : " + this.food);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
