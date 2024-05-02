package Chapter_2;

public class NameAndInitial {
    public static void main(String[] args) {
        String firstName = "Sulayman";
        String middleName = "Durieux";
        String lastName = "Colley";

        char firstInital = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial= lastName.charAt(0);

        System.out.println(firstInital);
        System.out.println(middleInitial);
        System.out.println(lastInitial);


    }
}
