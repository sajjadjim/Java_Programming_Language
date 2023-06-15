package Final_Exam_Practice;

public class Football extends Ball {

    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void bounce() {
        toss();
        System.out.println(super.getBrandName()+" is bounce.......");
    }
    @Override
    public void toss(){
        System.out.println("Play before toss.........");
    }
}
