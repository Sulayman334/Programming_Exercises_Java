package Chapter_6;

public class MonthDays {

    private int month, year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    private boolean isLeapYear() {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }

    public int getNumberOfDays() {

        switch (month) {
            case 1:

            case 3:

            case 5:


            case 7:


            case 8:


            case 10:


            case 12:


                return 31;

            case 4:


            case 6:


            case 9:


            case 11:

                return 30;

            case 2:
                System.out.println("February");
                if (isLeapYear()) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                System.out.println("Invalid Month! Enter a valid month");

        }


        return 0;
    }
}
