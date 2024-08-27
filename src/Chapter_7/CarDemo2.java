package Chapter_7;

public class CarDemo2 {
    public static void main(String[] args) {
        String[][] cars = {{"volvo", "beaker", "Audi"},{"Hyundai","Golf","Benz"},{"Honda","zik","solar"}};


        for (int i = 0; i < cars.length; i++){
            for (int j = 0; j < cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
            System.out.println();
        }


    }

}
