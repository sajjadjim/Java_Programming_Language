package basic_Operator;

import java.util.Scanner;

public class BitWise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter two number=");
        num1 = input.nextInt();
        num2 = input.nextInt();

        int c;

        c = num1 & num2;
        System.out.println("A & B=" + c);

        c = num1 | num2;
        System.out.println("A | B=" + c);

        c = num1 ^ num2;
        System.out.println("A ^ B=" + c);

        c = num1 >> 2;
        System.out.println("Num1 >> 2=" + c);

        c = num2 >> 2;
        System.out.println("Num2 >> 2=" + c);

        c = num1 >> 2;
        System.out.println("Num1 >> 2=" + c);

        c = num2 << 2;
        System.out.println("Num2 << 2=" + c);

    }

}
