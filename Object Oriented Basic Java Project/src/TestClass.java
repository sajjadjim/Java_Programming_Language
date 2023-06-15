import User_input.infoList;
public class TestClass {

    public static void main(String[] args) {
        System.out.println(" *****  Welcome To OOP Basic Java Project ***** ");
        infoList info = new infoList("Dr. Strange", 25);
        //ArryList Input From User
        info.information();

        // Display Crocodile Information
        Crocodile D = new Crocodile("Crocodylidae", 17, "12 Feet");
        D.display();

        // Display Human INformation
        System.out.println("\n~~ Human Information ~~\n");
        Human H = new Human("Homo sapiens", 23, "67 KG");
        H.display();

        //Display Bird Information
        System.out.println("\n** Bird Information **\n");
        Bird B = new Bird("Aves", "Haming-Bird");
        B.display();
        System.out.println();
        
        // Exception Handalling
        int a = 10;
        int b = 0;

        try {
            int sum = a / b;
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n");
        
        // Method Overloading
        TestClass obj = new TestClass();
        obj.sum(10.5, 10.5);
        obj.sum(20, 20);

    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}
