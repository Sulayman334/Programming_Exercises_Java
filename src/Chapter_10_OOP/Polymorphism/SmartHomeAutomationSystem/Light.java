package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

/**
 * The Light class represents a smart light device that can be turned on or off
 * and has adjustable brightness settings. It extends the SmartDevice class
 * and implements the Adjustable interface for brightness control.
 */
public class Light extends SmartDevice implements Adjustable {

    /**
     * The current brightness level of the light, ranging from 0 to 100.
     */
    protected int brightness;

    /**
     * Constructs a new Light object.
     *
     * @param deviceName  The name of the light device.
     * @param isOn        The initial state of the light (whether it is powered on or off).
     * @param brightness  The initial brightness level of the light (should be between 0 and 100).
     */
    public Light(String deviceName, boolean isOn, int brightness) {
        // Call the constructor of the superclass SmartDevice
        super(deviceName, isOn);
        // Initialize the brightness level
        this.brightness = brightness;
    }

    /**
     * Increases the brightness of the light by 10, up to a maximum of 100.
     * If the brightness is already at 100, it prints a message that it cannot be increased further.
     */
    @Override
    public void increaseSettings() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println("Light brightness increased to: " + brightness);
        } else {
            System.out.println("Light brightness cannot be increased further.");
        }
    }

    /**
     * Decreases the brightness of the light by 10, down to a minimum of 0.
     * If the brightness is already at 0, it prints a message that it cannot be decreased further.
     */
    @Override
    public void decreaseSettings() {
        if (brightness > 0) {
            brightness -= 10;  // Fixed: Subtract brightness instead of adding.
            System.out.println("Light brightness decreased to: " + brightness);
        } else {
            System.out.println("Light brightness cannot be decreased further.");
        }
    }

    /**
     * Performs the main function of the light, which is to print its current status.
     * If the light is on, it prints the brightness level. Otherwise, it prints that the light is off.
     */
    @Override
    void performFunction() {
        if (isOn) {
            System.out.println("Light is on and brightness is: " + brightness);
        } else {
            System.out.println("Light is off");
        }
    }
}
