package Chapter_6;

public class CellPhone {
    private String manufacturer;
    private String model;
    private double retailPrice;

    public CellPhone(String manufacturer, String model, double retailPrice){
        this.manufacturer = manufacturer;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setRetailPrice(double retailPrice){
        this.retailPrice = retailPrice;
    }

    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public double getRetailPrice(){
        return retailPrice;
    }
}
