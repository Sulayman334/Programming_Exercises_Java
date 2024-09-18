package Chapter_6_Classes;

public class EmployeeClass {
    private String name;
    private String idNumber;
    private String department;
    private String position;

    public EmployeeClass(String name, String idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public String getName(){
        return name;
    }
    public String getIdNumber(){
        return idNumber;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }

}
