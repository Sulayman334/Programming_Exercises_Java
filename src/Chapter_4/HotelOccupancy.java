package Chapter_4;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of floors in hotel");
        int numOfFloors = keyboard.nextInt();
        int numOfRooms;
        int numOfOccupiedRooms;
        int totalNumOfRoomsInTheHotel = 0;
        int totalNumOfOccupiedRooms = 0;
        int numberOfVacantRooms = 0;
        double occupancyRate =0;

            for (int i = 1; i <= numOfFloors; i++){
                System.out.println("Enter the number of rooms on floor " + i);
                numOfRooms = keyboard.nextInt();

                System.out.println("Enter the number of occupied rooms in floor " +i);
                numOfOccupiedRooms = keyboard.nextInt();
                totalNumOfRoomsInTheHotel  += numOfRooms;
                totalNumOfOccupiedRooms += numOfOccupiedRooms;
                numberOfVacantRooms = totalNumOfRoomsInTheHotel  - totalNumOfOccupiedRooms;
                occupancyRate = ((double) totalNumOfOccupiedRooms /totalNumOfRoomsInTheHotel) * 100;
            }
        System.out.println("The total number of rooms in the hotel is: : "+ totalNumOfRoomsInTheHotel);
        System.out.println("The total number of occupied rooms in the hotel is: "+ totalNumOfOccupiedRooms);
        System.out.println("The number of vacant rooms is/are: " + numberOfVacantRooms);
        System.out.println("The occupancy rate is: " + occupancyRate+"%");


    }
}
