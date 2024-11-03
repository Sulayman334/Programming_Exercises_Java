package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

public class Main {
    public static void main(String[] args) {

        // Create a new instance of SmartHome to manage smart devices
        SmartHome smartHome = new SmartHome();

        // Create various smart devices and initialize them with device names, on/off state, and additional properties
        Light livingRoomLight = new Light("Living Room Light", true, 50);
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat", true, 20);
        Lock frontDoor = new Lock("Front Door", true, true);
        Camera securityCamera = new Camera("Security Camera", true, true);
        Appliance appliance = new Appliance("Smart Washing Machine", true, "Electronic");

        // Interact with individual smart devices by invoking their specific methods
        livingRoomLight.increaseSettings();   // Increases brightness of the living room light
        livingRoomThermostat.increaseSettings();  // Increases temperature of the thermostat
        frontDoor.unlock();   // Unlocks the front door
        securityCamera.startRecording();  // Starts recording using the security camera

        System.out.println("\n");

        // Add the smart devices to the SmartHome object for centralized control
        smartHome.addSmartDevice(livingRoomLight);
        smartHome.addSmartDevice(livingRoomThermostat);
        smartHome.addSmartDevice(frontDoor);
        smartHome.addSmartDevice(securityCamera);
        smartHome.addSmartDevice(appliance);

        // Execute predefined automation scenarios in the SmartHome class
        System.out.println("___EXECUTING AUTOMATION SCENARIOS___");
        smartHome.nightMode();      // Configures devices for night mode (e.g., turning off lights, locking doors)
        System.out.println("--------------------------------");
        smartHome.morningRoutine(); // Configures devices for the morning routine (e.g., turning on lights, adjusting thermostat)
        System.out.println("--------------------------------");
        smartHome.awayMode();       // Configures devices for away mode (e.g., locking doors, turning off appliances)

        System.out.println("\n");

        // Display the status of all devices before automation scenarios are executed
        System.out.println("___DEVICE STATUS BEFORE SCENARIOS___");
        smartHome.displayAllDevices(); // Display the status of each device in the SmartHome system

        System.out.println("\n");

        // Display the status of all devices after automation scenarios are executed
        System.out.println("___DEVICE STATUS AFTER SCENARIOS___");
        smartHome.displayAllDevices();
    }
}

