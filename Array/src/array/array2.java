package array;

import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] num = new double[5];
        double sum = 0;

        System.out.print("Enter 5 number = ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        double avg = sum / num.length;

        System.out.println("Avarage of number =" + avg);
        System.out.println("Total number sof sum =" + sum);

    }
}
