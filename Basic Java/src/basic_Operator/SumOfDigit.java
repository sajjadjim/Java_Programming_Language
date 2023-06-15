package basic_Operator;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, r, temp, sum = 0;
        System.out.print("Enter a number=");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.print("The digit of number =" + sum);
    }

}
