package User_input;
import java.util.ArrayList;
import java.util.Scanner;

public class infoList extends getValue {

    public infoList(String name, int age) {
        super(name, age);
    }

    public void information() {
        ArrayList<infoList> arList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of N : ");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter name : ");
            String infoName = input.next();

            System.out.print("Enter age : ");
            int infoAge = input.nextInt();

            arList.add(new infoList(infoName, infoAge));

        }
        // Display Information 

        for (int i = 0; i < arList.size(); i++) {
            System.out.println("Name :"+this.getName());
            System.out.println("Name :"+this.getAge());
        }
    }

}
