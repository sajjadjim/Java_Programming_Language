package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonClass {

    String name;
    int age;

    PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayList<PersonClass> personList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the Numbe of N = ");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print(" Entert Name : ");
            String pName = input.next();

            System.out.print("Enter Age : ");
            int pAge = input.nextInt();
            personList.add(new PersonClass(pName, pAge));
        }
        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).Display();
        }
    }
    void Display() {
        System.out.println(" \n ");
        System.out.println(" Name : " + this.getName());
        System.out.println(" Age : " + this.getAge());
        System.out.println("");
    }

}
