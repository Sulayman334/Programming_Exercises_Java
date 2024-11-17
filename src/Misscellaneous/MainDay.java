package Misscellaneous;

public class MainDay {
    public static void main(String[] args) {

        Day today = Day.WEDNESDAY;
        System.out.println(today);

        switch (today){
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;

            case MONDAY:
                System.out.println("Today is Monday");
                break;

            case SATURDAY:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Unknown");
                break;
        }
    }
}
