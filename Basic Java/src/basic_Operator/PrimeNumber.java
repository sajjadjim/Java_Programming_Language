package basic_Operator;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, num = 0;

        System.out.print("Enter a positive integer number=");
        num = input.nextInt();

        for (int j = 2; j < num; j++) {

            if (num % 2 == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number ");
        }

    }

}
