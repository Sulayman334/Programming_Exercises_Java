package Chapter_4;

public class Clock {
    public static void main(String[] args) {

        for (int hours = 1; hours <= 12; hours++){

            for (int minutes = 0; minutes <= 60; minutes++){

                for (int seconds = 0; seconds <= 60; seconds++){
                    System.out.println(hours +":"+ minutes+":"+seconds);
                }

            }

        }
    }
}
