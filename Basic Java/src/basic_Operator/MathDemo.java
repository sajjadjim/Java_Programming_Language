package basic_Operator;

import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter two number=");
        x = input.nextInt();
        y = input.nextInt();

        int max = Math.max(x, y);
        System.out.println("Maximun number=" + max);

        int min = Math.min(x, y);
        System.out.println("Minimum number=" + min);

        double pow = Math.pow(x, y);
        System.out.println("Power=" + pow);

        double pi = Math.PI;
        System.out.println("Pi value=" + pi);

    }

}
