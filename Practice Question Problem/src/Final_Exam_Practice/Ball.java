package Final_Exam_Practice;
public abstract class Ball implements Tossable {
   private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public abstract void bounce();

    @Override
    public void toss() {
        System.out.println("First Toss then play with Ball.......");
    }
}
