package problem;

public class Teacher extends Person {
    String deggnation;
    String dpt;
    
    void Teacher(String deggnation, String dpt ){
        this.deggnation = deggnation;
        this.dpt = dpt;
    }
    void Display(){
        
        System.out.println("Degination : "+this.deggnation);
        System.out.println("DEPT : "+this.dpt);
    }
}
