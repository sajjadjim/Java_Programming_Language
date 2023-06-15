package problem;

public class Person {
    private String name;
    private int age;
    
    public void Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    void Display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}
