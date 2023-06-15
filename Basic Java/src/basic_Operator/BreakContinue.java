package basic_Operator;

public class BreakContinue {

    public static void main(String[] args) {

        int i = 1;
        for (i = 1; i <= 100; i++) {

            if (i == 10) {
                continue; //break;
            }
            System.out.println("Bangladesh");
        }
    }
}
