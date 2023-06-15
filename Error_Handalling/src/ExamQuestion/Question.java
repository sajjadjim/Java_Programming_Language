package ExamQuestion;

public class Question {

    public static void main(String[] args) {

        try {
            badMethod();
            System.out.println(" A ");
        } 
        catch (RuntimeException ex) {
            System.out.println(" B ");      
        } 
        
        catch (Exception ex1) {
            System.out.println(" C ");
        } 
        
        finally {
            System.out.println(" D ");
        }
        System.out.println(" E ");
    }
    
    public static void badMethod() {
        throw new RuntimeException();
    }
}
