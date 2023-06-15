package basic_Operator;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, multi = 1;

        System.out.print("Enter number=");
        num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            multi = num * i;
            System.out.println(num + " X " + i + "=" + multi);
        }

    }

}
