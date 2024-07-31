package Chapter_6;

public class CarClass {

    private int yearModel;
    private String make;
    private int speed =0;

    public CarClass(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }



    public void setYearModel(int yearModel){
        this.yearModel = yearModel;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getYearModel(){
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    public void accelerate(int speedIncrement){
        speed += speedIncrement;
    }

    public void brake(int speedDecrement){
        speed -= speedDecrement;
    }
}


