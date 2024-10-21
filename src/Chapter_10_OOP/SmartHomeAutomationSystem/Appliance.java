package Chapter_10_OOP.SmartHomeAutomationSystem;

/**
 * The Appliance class represents a specific type of SmartDevice that performs
 * functions such as laundering clothes. It extends the SmartDevice class.
 */
public class Appliance extends SmartDevice {

    // Type of the appliance, e.g., washing machine, dryer, etc.
    protected String applianceType;

    /**
     * Constructor to create an instance of Appliance.
     *
     * @param deviceName     the name of the appliance
     * @param isOn           the status of the appliance (on/off)
     * @param applianceType  the type of appliance (e.g., washing machine)
     */
    public Appliance(String deviceName, boolean isOn, String applianceType) {
        // Call the constructor of the superclass (SmartDevice)
        super(deviceName, isOn);
        this.applianceType = applianceType;
    }

    /**
     * Overrides the performFunction method from SmartDevice.
     * If the appliance is on, it performs its specific function (laundering clothes),
     * otherwise it states that the appliance is off.
     */
    @Override
    void performFunction() {
        if (isOn) {
            System.out.println("The " + deviceName + " is laundering our clothes.");
        } else {
            System.out.println("The " + deviceName + " is off.");
        }
    }
}

