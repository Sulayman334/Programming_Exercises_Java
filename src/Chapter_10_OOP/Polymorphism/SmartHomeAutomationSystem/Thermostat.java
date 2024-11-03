package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

/**
 * The Thermostat class represents a smart thermostat device that can be adjusted to
 * control the temperature. It extends the SmartDevice class and implements the
 * Adjustable interface, allowing it to increase or decrease its temperature settings.
 */
public class Thermostat extends SmartDevice implements Adjustable {

    /**
     * The current temperature setting of the thermostat.
     */
    protected double temperature;

    /**
     * Constructs a Thermostat with a specified name, power state, and initial temperature.
     *
     * @param deviceName  The name of the thermostat device.
     * @param isOn        The initial power state of the thermostat (true for on, false for off).
     * @param temperature The initial temperature setting of the thermostat.
     */
    public Thermostat(String deviceName, boolean isOn, double temperature) {
        super(deviceName, isOn);
        this.temperature = temperature;
    }

    /**
     * Increases the thermostat temperature by 1.0 degrees.
     * Prints a message indicating the change.
     */
    @Override
    public void increaseSettings() {
        temperature += 1.0;
        System.out.println(deviceName + " temperature increased by 1.0 degrees to " + temperature + "°C.");
    }

    /**
     * Decreases the thermostat temperature by 1.0 degrees.
     * Prints a message indicating the change.
     */
    @Override
    public void decreaseSettings() {
        temperature -= 1.0;
        System.out.println(deviceName + " temperature decreased by 1.0 degrees to " + temperature + "°C.");
    }

    /**
     * Performs the main function of the thermostat, which is to display its current
     * temperature setting if it is turned on. If the thermostat is off, it prints
     * a message indicating that it is off.
     */
    @Override
    void performFunction() {
        if (isOn) {
            System.out.println(deviceName + " is on and temperature is set to: " + temperature + "°C.");
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}
