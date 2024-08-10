package Chapter_6;

public class TemperatureClass {

    private double fTemp;

    public TemperatureClass(double fTemp) {
    this.fTemp = fTemp;
    }

    public void setFahrenheit(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getFahrenheit() {
        return fTemp;
    }

    public double getCelsius() {
        return  ((double) 5 /9) * (fTemp - 32);

    }

    public double getKelvin() {
        return  (((double) 5 /9) * (fTemp - 32)) + 273;
    }

}
