package Chapter_6;

public class PersonalInformationClassTest {
    public static void main(String[] args) {

        PersonalInformationClass myInfo = new PersonalInformationClass("Sully", 22,
                "BSB", "3340808\n\n");

        System.out.println("Personal Information");
        System.out.println("Name: "+myInfo.getName());
        System.out.println("Age: "+myInfo.getAge());
        System.out.println("Address: "+myInfo.getAddress());
        System.out.println("Phone Number: "+myInfo.getPhoneNumber());

        PersonalInformationClass familyInfo = new PersonalInformationClass("Ensa",
                15,"KJJ","33456");

        System.out.println("Family Information");
        System.out.println("Name: "+familyInfo.getName());
        System.out.println("Age: "+familyInfo.getAge());
        System.out.println("Address: "+familyInfo.getAddress());
        System.out.println("Phone Number: "+familyInfo.getPhoneNumber());
    }
}
