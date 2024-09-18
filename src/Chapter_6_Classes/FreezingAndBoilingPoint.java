package Chapter_6_Classes;

public class FreezingAndBoilingPoint {
    private  double temperature;

    public FreezingAndBoilingPoint(double temperature){
        this.temperature = temperature;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    public boolean isEthyFreezing(){
        return temperature <= -173;
    }

    public boolean isEthyBoiling(){
        return temperature >= 173;
    }

    public boolean isOxygenFreezing(){
        return temperature <= -327;
    }

    public boolean isOxygenBoiling(){
        return temperature >= -306;
    }

    public boolean isWaterFreezing(){
        return temperature <= 0;
    }

    public boolean isWaterBoiling(){
        return temperature >= 100;
    }

}
