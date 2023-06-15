package problem;

import java.util.Scanner;
public class Department {
    String deptName;
    int deptCode;

    void Department(String deptName, int deptCode) {
        this.deptName = deptName;
        this.deptCode = deptCode;
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Student s1 = new Student();
        s1.Person("Rifat", 25);
        s1.Student("221-15-5364", 3.55);
        s1.Display();
        s1.Display();
        Department d1 = new Department();
        d1.Department("Cse", 221);
        d1.DisplayAll();

        System.out.println("\n");

        Teacher t1 = new Teacher();
        t1.Teacher("Advisor", "CSE");
        t1.Person("Itisha Nowrin ", 37);
        t1.Display();
        t1.Display();
        Department d2 = new Department();
        d2.Department("CSE", 333);
        d2.DisplayAll();

    }

    void DisplayAll() {
        System.out.println("Department name : " + this.deptName);
        System.out.println("Code name : " + this.deptCode);
    }

}
