package problem;

public class Student extends Person {
 String id;
 double cgpa;
    
  public  void Student(String id , double cgpa){
       
        this.cgpa = cgpa;
        this.id =id;
    }
void Display(){
    System.out.println("ID : "+this.id);
    System.out.println("CGPA : "+this.cgpa);
}
}
