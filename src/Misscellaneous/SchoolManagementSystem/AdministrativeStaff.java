package Misscellaneous.SchoolManagementSystem;

public class AdministrativeStaff extends Employee{
    private String role;

    public AdministrativeStaff(String name, int age, String id, double salary, String role) {
        super(name, age, id, salary);
        this.role = role;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Role: " + role);
    }

    public void performDuties(){
        System.out.println(name +"is performing administrative duties as a "+role);
    }
}
