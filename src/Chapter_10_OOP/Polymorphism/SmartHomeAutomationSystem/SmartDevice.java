package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

/**
 * The SmartDevice class serves as an abstract base class for all smart devices
 * in the Smart Home Automation System. It provides common properties such as
 * the device name and power state, along with methods to turn devices on or off.
 * Subclasses must implement their own specific functionality via the
 * abstract performFunction() method.
 */
public abstract class SmartDevice {

    /**
     * The name of the smart device.
     */
    protected String deviceName;

    /**
     * Indicates whether the smart device is currently on or off.
     */
    protected boolean isOn;

    /**
     * Constructs a SmartDevice with a specified name and power state.
     *
     * @param deviceName  The name of the device.
     * @param isOn        The initial power state of the device (true for on, false for off).
     */
    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    /**
     * Turns the device on by setting the isOn flag to true.
     * Prints a message indicating that the device has been turned on.
     */
    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is turned on.");
    }

    /**
     * Turns the device off by setting the isOn flag to false.
     * Prints a message indicating that the device has been turned off.
     */
    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is turned off.");
    }

    /**
     * Defines the primary function of the smart device. Each subclass
     * must provide its own specific implementation of this method.
     */
    abstract void performFunction();
}
