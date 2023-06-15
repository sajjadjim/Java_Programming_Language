package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        ArrayList<Animal> perList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Animal: ");
        int N = input.nextInt();

        System.out.println("\n");
        System.out.println("** Enter Animal Information **");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter name: ");
            String aName = input.next();
            System.out.print("Enter age: ");
            int aAge = input.nextInt();
            System.out.print("Enter Food: ");
            String aFood = input.next();

            perList.add(new Animal(aName, aAge, aFood));
            System.out.println("\n");
        }

        System.out.println("**** Animal Information ****");
        for (int i = 0; i < perList.size(); i++) {
            System.out.println((i + 1) + " Number Animal :");
            perList.get(i).display();
            System.out.println("");
        }

        System.out.print("Enter age you want to search: ");
        int aAge = input.nextInt();
        int flag = 0;

        for (int i = 0; i < perList.size(); i++) {

            if (aAge == perList.get(i).getAge()) {
                System.out.println("FOUND in " + (i + 1) + " Number Serial");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Not FOUND");
        }

        System.out.println(" ** Edit Information  ** \n");
        System.out.print("Enter index : ");
        int index = input.nextInt();
        System.out.print("Enter new Name : ");
        input.nextLine();
        String eName = input.nextLine();
        System.out.print("Enter new Age : ");
        int eAge = input.nextInt();
        System.out.print("Food name : ");
        String eFood = input.next();

        // perList.add(new Animal(eName,eAge,eFood));
        perList.get(index).setName(eName);
        perList.get(index).setAge(eAge);
        perList.get(index).setFood(eFood);

        System.out.println("** Animal Information Display After Edit **");
        for (int i = 0; i < N; i++) {
            System.out.println("Name : " + perList.get(i).getName());
            System.out.println("Age : " + perList.get(i).getAge());
            System.out.println("Food : " + perList.get(i).getFood());
            System.out.println("\n");
        }

        System.out.println("Enter index to  remove :  ");
        int delete = input.nextInt();
        perList.remove(delete);

        System.out.println(" Animal Information After Delete ");
        for (int i = 0; i < perList.size(); i++) {
            perList.get(i).display();
        }
    }

}
