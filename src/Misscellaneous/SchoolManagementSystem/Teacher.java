package Misscellaneous.SchoolManagementSystem;

public class Teacher extends Employee{
    private String subject;

    public Teacher(String name, int age, String id, double salary,String subject) {
        super(name, age, id,salary);
        this.subject = subject;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(name + "is teaching" + subject );
    }

    public void teach(){
        System.out.println(name + " is teaching " + subject);
    }
}
