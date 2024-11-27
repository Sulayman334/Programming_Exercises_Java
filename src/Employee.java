public class Employee {
    String name;
    double salary;
    int yearOfService;

    public Employee(String name, double salary, int yearOfService) {
        this.name = name;
        this.salary = salary;
        this.yearOfService = yearOfService;
    }

    public void evaluatePerformance(){
        if (yearOfService >= 10){
            System.out.println("Excellent");
        } else if (yearOfService > 5 && yearOfService < 9) {
            System.out.println("Good");
        } else if (yearOfService > 1 && yearOfService <4) {
            System.out.println("Average");
        } else if (yearOfService == 0){
            System.out.println("New hire");
        }

    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alima", 50000, 15);
        Employee employee2 = new Employee("Ojay", 40000, 8);

        employee1.evaluatePerformance();
        employee2.evaluatePerformance();
    }

}
