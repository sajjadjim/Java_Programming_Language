package basic_Operator;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fact = 1;
        System.out.print("Enter any number=");
        n = input.nextInt();

        for (int i = n; i >= 1; i--) {

            fact = fact * i;

        }
        System.out.println("Factorial Of " + n + "=" + fact);
    }
}
