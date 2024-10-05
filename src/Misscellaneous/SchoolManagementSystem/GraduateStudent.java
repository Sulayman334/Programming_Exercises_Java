package Misscellaneous.SchoolManagementSystem;

public class GraduateStudent extends Student{
    private String researchTopic;

    public GraduateStudent(String name, int age, String id, String major,String researchTopic) {
        super(name, age, id, major);
        this.researchTopic = researchTopic;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }

    public void conductResearchResearch(){
        System.out.println(name + ": is conducting a research on" + researchTopic);
        System.out.println("--------------------------------------------------------");
    }
}
