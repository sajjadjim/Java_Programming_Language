package Object_Create;

public class Person {

    String name;
    int age;

    public static void main(String[] args) {
        Person p = new Person();     // Create Object person = " p "
        p.name = "JIM";
        p.age = 24;
        p.display();             // Method Call
    }

    public void display() {    // Display method
        System.out.println("My name :" + name);
        System.out.println("My age :" + age);
    }

}
