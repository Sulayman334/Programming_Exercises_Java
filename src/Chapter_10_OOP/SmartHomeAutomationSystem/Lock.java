package Chapter_10_OOP.SmartHomeAutomationSystem;

/**
 * The Lock class represents a smart lock device that can be locked and unlocked.
 * It extends the SmartDevice class, inheriting basic device functionality like
 * turning on or off. This class adds specific behaviors related to locking and unlocking.
 */
public class Lock extends SmartDevice {

    /**
     * Indicates whether the lock is currently locked or unlocked.
     */
    protected boolean isLocked;

    /**
     * Constructs a new Lock object.
     *
     * @param deviceName  The name of the lock device.
     * @param isOn        The initial state of the lock (whether it is powered on or off).
     * @param isLocked    The initial locked state of the lock.
     */
    public Lock(String deviceName, boolean isOn, boolean isLocked) {
        // Call the constructor of the superclass SmartDevice
        super(deviceName, isOn);
        // Initialize the locked state
        this.isLocked = isLocked;
    }

    /**
     * Locks the smart lock by setting isLocked to true.
     * Prints a message indicating the device is locked.
     */
    void lock() {
        isLocked = true;
        System.out.println(deviceName + " is locked");
    }

    /**
     * Unlocks the smart lock by setting isLocked to false.
     * Prints a message indicating the device is unlocked.
     */
    void unlock() {
        isLocked = false;
        System.out.println(deviceName + " is unlocked");
    }

    /**
     * Toggles the lock's functionality.
     * If the lock is currently locked, it will be unlocked. If it is unlocked,
     * it will be locked. This method overrides the performFunction() method from
     * the SmartDevice class.
     */
    @Override
    void performFunction() {
        // Check the current lock state and toggle accordingly
        if (isLocked) {
            unlock();
        } else {
            lock();
        }
    }
}

