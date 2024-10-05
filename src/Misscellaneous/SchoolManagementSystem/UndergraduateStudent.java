package Misscellaneous.SchoolManagementSystem;

public class UndergraduateStudent extends Student{

    private int year;

    public UndergraduateStudent(String name, int age, String id,String major, int year) {
        super(name, age, id,major);
        this.year = year;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Year: " + year);
    }

    public void attendLectures(){
        System.out.println(name +" is attending an undergraduate lecture.");
    }
}
