package Chapter_4_LoopsAndFiles;

public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println("KPH   MPH");
        System.out.println("----------");
        int kph;
        double mph;
        for (kph = 60; kph <= 130;kph += 10){
            mph = kph * 0.6214;
            System.out.println(kph +" "+ Math.round(mph));
            
        }
    }
}
