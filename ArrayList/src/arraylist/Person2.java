package arraylist;

import java.util.ArrayList;

public class Person2 {
private String name;
private int age;
 public Person2(String name, int age) {
     this.name = name;
     this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String name) {
        this.name = name;
    }

    public void Display(){
        System.out.println(" Name : "+this.name);
        System.out.println(" Age : "+this.age);
    }
    
    public static void main(String[] args) {
        ArrayList<Person2> person2List = new ArrayList<Person2>();
        
        Person2 p1 = new Person2("Sajjad Jim",23);
        person2List.add(p1);
        Person2 p2 = new Person2("Siam",23);
        person2List.add(p2);
        
        person2List.add(new Person2("Labonno",23));
        person2List.add(new Person2("Kubra",13));
        
        

                
    }
}
