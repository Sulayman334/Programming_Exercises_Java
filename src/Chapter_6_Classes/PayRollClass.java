package Chapter_6_Classes;

public class PayRollClass {
    private String employeeName;
    private String employeeID;
    private int hourlyPayRate;
    private int numberOfHoursWorked;

    public PayRollClass(String employeeName, String employeeID, int hourlyPay, int numberOfHoursWorked){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.hourlyPayRate = hourlyPay;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public void setHourlyPayRate(int hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked){
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public int getHourlyPayRate(){
        return hourlyPayRate;
    }

    public int getNumberOfHoursWorked(){
        return numberOfHoursWorked;
    }

    public double employeeGrossPay(int numberOfHoursWorked,int hourlyPayRate){
        return numberOfHoursWorked * hourlyPayRate;
    }

}
