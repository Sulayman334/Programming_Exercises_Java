package Misscellaneous.SchoolManagementSystem;

public class TechnicalStaff extends Employee{
    private String expertise;

    public TechnicalStaff(String name, int age, String id, double salary,String expertise) {
        super(name, age, id, salary);
        this.expertise = expertise;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Expertise: " + expertise);
    }

    public void maintainEquipment(){
        System.out.println(name +" is maintaining equipment related to "+expertise);
        System.out.println("----------------------------------------------------------------");
    }
}
