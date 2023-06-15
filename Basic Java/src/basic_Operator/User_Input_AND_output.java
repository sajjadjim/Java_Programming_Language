package basic_Operator;

import java.util.Scanner;

public class User_Input_AND_output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name=");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        System.out.print("Enter your age=");
        int age = input.nextInt();
        System.out.println("Your age " + age);

        System.out.print("Enter your id number=");
        String id = input.next();
        System.out.println("Your ID " + id);

        System.out.print("Enter your Department name=");
        String dpt = input.next();
        System.out.println("Your department name " + dpt);
    }
}
