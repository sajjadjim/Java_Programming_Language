package basic_Operator;

import java.util.Scanner;

public class Fibonakki {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter How many number you want=");
        n = input.nextInt();
        int first = 0, second = 1;
        int fibo;
        System.out.print(first + " " + second);
        for (int i = 0; i <= n; i++) {

            fibo = first + second;
            System.out.print(" " + fibo);
            first = second;
            second = fibo;
        }
    }
}
