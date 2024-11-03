package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

import java.util.ArrayList;

/**
 * The SmartHome class is responsible for managing multiple smart devices
 * within a home automation system. It allows devices to be added, removed,
 * controlled, and operated in predefined modes like "night mode" and "away mode."
 */
public class SmartHome {

    // List to store all smart devices in the smart home system
    ArrayList<SmartDevice> smartDevices = new ArrayList<>();

    /**
     * Adds a new smart device to the SmartHome system.
     *
     * @param device The smart device to be added.
     */
    void addSmartDevice(SmartDevice device) {
        smartDevices.add(device);
    }

    /**
     * Removes a smart device from the SmartHome system by its device name.
     *
     * @param deviceName The name of the device to be removed.
     */
    void removeSmartDevice(String deviceName) {
        SmartDevice deviceToRemove = findDeviceByName(deviceName);
        if (deviceToRemove != null) {
            smartDevices.remove(deviceToRemove);
        } else {
            System.out.println("Device not found: " + deviceName);
        }
    }

    /**
     * Turns on all devices in the SmartHome system.
     */
    void turnOnAllDevices() {
        for (SmartDevice device : smartDevices) {
            device.turnOn();
        }
    }

    /**
     * Displays the status or functionality of all devices in the SmartHome system
     * by calling their specific performFunction method.
     */
    void displayAllDevices() {
        for (SmartDevice device : smartDevices) {
            device.performFunction();
        }
    }

    /**
     * Finds and returns a smart device by its name.
     *
     * @param deviceName The name of the smart device to search for.
     * @return The smart device if found, otherwise null.
     */
    SmartDevice findDeviceByName(String deviceName) {
        for (SmartDevice device : smartDevices) {
            if (device.deviceName.equalsIgnoreCase(deviceName)) {
                return device;
            }
        }
        return null;
    }

    /**
     * Activates the "Night Mode" scenario.
     * Turns off all lights, locks all doors, and starts recording on all cameras.
     */
    public void nightMode() {
        System.out.println("Night Mode is activated");
        for (SmartDevice device : smartDevices) {
            if (device instanceof Light) {
                device.turnOff();
            } else if (device instanceof Lock) {
                ((Lock) device).lock();
            } else if (device instanceof Camera) {
                ((Camera) device).startRecording();
            }
        }
    }

    /**
     * Activates the "Away Mode" scenario.
     * Decreases the thermostat settings, locks all doors, and turns off appliances.
     */
    public void awayMode() {
        System.out.println("Away Mode is activated");
        for (SmartDevice device : smartDevices) {
            if (device instanceof Thermostat) {
                ((Thermostat) device).decreaseSettings();
            } else if (device instanceof Lock) {
                ((Lock) device).lock();
            } else if (device instanceof Appliance) {
                device.turnOff();
            }
        }
    }

    /**
     * Activates the "Morning Routine" scenario.
     * Turns on all lights and adjusts the thermostat settings for the morning.
     */
    public void morningRoutine() {
        System.out.println("Morning Routine is activated");
        for (SmartDevice device : smartDevices) {
            if (device instanceof Light) {
                device.turnOn();
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).increaseSettings();
            }
        }
    }
}
