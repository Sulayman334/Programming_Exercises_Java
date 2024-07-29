package Chapter_6;

public class Rectangle {
    private double length;
    private double width;

    public void setLength(double len) {
        this.length = len;
    }

    public void setWidth(double wid) {
        this.width = wid;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public double getArea(){
        return length * width;
    }
}
