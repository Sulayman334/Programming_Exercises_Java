package Misscellaneous.SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        ArrayList<Person>  people = new ArrayList<Person>();

        Person person1 = new UndergraduateStudent("Sulayman Colley",22,"00001","Information Systems",2022);
        Person person2 = new UndergraduateStudent("Abubacarr Jobe",22,"00002","Development Studies",2023);

        Person person3 = new Teacher("Dr. Amelia Earhart",50,"00003",10000,"Further Maths");
        Person person4 = new Teacher("Mr. George Washington",45,"00004",9000,"Civic Engineering");

        Person person5 = new AdministrativeStaff("Mr Assan Jahateh",50,"00005",10000,"Admissions Officer");
        Person person6 = new AdministrativeStaff("Remi Badjie",48,"00006",20000,"Registrar");

        Person person7 = new GraduateStudent("Lamin Jallow",250,"00007","Political Science","Policy Development");
        Person person8 = new GraduateStudent("Nabila Abdul-Rahman",24,"00008","Computer Science","Information Ethics");

        Person person9 = new TechnicalStaff("Abubacarr Manneh",50,"00009",3000,"IT Support");
        Person person10 = new TechnicalStaff("Amelia Earhart",45,"00010",6000,"Laboratory Technician");

        Person person11 = new Employee("Bamba",50,"00011",8000);


        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);
        people.add(person11);



        for (Person person : people) {
            person.displayInfo();
            person.greet();
            System.out.println("----------------------------------------------------------------");
        }


        if (person1 instanceof UndergraduateStudent){
            System.out.println(person1.name + "is undergraduate");
            ((UndergraduateStudent) person1).attendLectures();

        } if (person2 instanceof UndergraduateStudent){
            System.out.println(person2.name + "is undergraduate");
            ((UndergraduateStudent) person2).attendLectures();
            }
        if (person3 instanceof Teacher){
            System.out.println(person3.name + "is a teacher");
            ((Teacher) person3).teach();
        }
        if (person4 instanceof Teacher){
            System.out.println(person4.name + "is a teacher");;
            ((Teacher) person4).teach();
        }
        if (person5 instanceof AdministrativeStaff){
            System.out.println(person5.name + " is an administrative staff");
            ((AdministrativeStaff) person5).performDuties();
        }
        if (person6 instanceof AdministrativeStaff){
            System.out.println(person6.name + " is an administrative staff");
            ((AdministrativeStaff) person6).performDuties();
        }
        if (person7 instanceof GraduateStudent){
            System.out.println(person7.name + " is a graduate student");
            ((GraduateStudent) person7).conductResearchResearch();
        }
        if (person8 instanceof GraduateStudent){
            System.out.println(person8.name + " is a graduate student");
            ((GraduateStudent) person8).conductResearchResearch();
        }
        if (person9 instanceof TechnicalStaff){
            System.out.println(person9.name + " is a technical staff");
            ((TechnicalStaff) person9).maintainEquipment();
        }
        if (person10 instanceof TechnicalStaff){
            System.out.println(person10.name + " is a technical staff");
            ((TechnicalStaff) person10).maintainEquipment();
        }

        if (person11 instanceof  Employee){
            System.out.println(person11.name + " is a new employee");
            System.out.println("----------------------------------------------------------------");
        }

        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Malick",22,"20001","Development Studies");
        Student student2 = new Student("Mahmoud",21,"20002","Information Systems");
        students.add(student1);
        students.add(student2);

        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("John Doe",35,"30001",5000);
        Employee employee2 = new Employee("Jane Smith",37,"30002",6000);
        employees.add(employee1);
        employees.add(employee2);

        for (Employee employee : employees){
            employee.displayInfo();
            employee.greet();
            System.out.println("----------------------------------------------------------------");
        }

        for (Student student : students){
            student.displayInfo();
            student.greet();
            System.out.println("----------------------------------------------------------------");
        }

        Collections.sort(people, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });








    }
}
