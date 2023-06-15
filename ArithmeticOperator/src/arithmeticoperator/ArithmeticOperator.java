package arithmeticoperator;

import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, result, num2;

        System.out.print("Enter First number:");
        num1 = input.nextInt();

        System.out.print("Enter Second number:");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("sum =" + result);

        result = num1 - num2;
        System.out.println("Divine =" + result);

        result = num1 * num2;
        System.out.println("Multipile =" + result);

        result = num1 / num2;
        System.out.println("Division =" + result);
    }

}
