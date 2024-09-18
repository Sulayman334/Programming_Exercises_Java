package Chapter_6_Classes;

public class EmployeeClassTest {
    public static void main(String[] args) {

        EmployeeClass employee1 = new EmployeeClass("John Doe", "0001", "IT","Manager");
        EmployeeClass employee2 = new EmployeeClass("Jane Smith", "0002", "Finance",
                "Deputy Director");
        EmployeeClass employee3 = new EmployeeClass("Soldier Smith", "0003", "Mechanical",
                "Field Specialists");


        System.out.println("Name\t\t\t\t ID Number\t\t\t\t Department\t\t\t\t Position");
        System.out.println("______________________________________________________________________________");
        System.out.println(employee1.getName()+"\t\t\t\t"+employee1.getIdNumber()+"\t\t\t\t\t"+
                employee1.getDepartment()+"\t\t\t\t\t"+employee1.getPosition());

        System.out.println(employee2.getName()+"\t\t\t\t"+employee2.getIdNumber()+"\t\t\t\t\t"+
                employee2.getDepartment()+"\t\t\t\t"+employee2.getPosition());

        System.out.println(employee3.getName()+"\t\t\t"+employee3.getIdNumber()+"\t\t\t\t\t"+
                employee3.getDepartment()+"\t\t\t"+employee3.getPosition());
    }
}
