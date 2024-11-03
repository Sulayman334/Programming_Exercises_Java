package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

/**
 * The Adjustable interface defines the contract for objects that have adjustable settings.
 * It contains two methods to increase and decrease settings.
 */
public interface Adjustable {

    /**
     * Increases the current settings of the object.
     * Implementing classes should define the specific behavior for increasing the settings.
     */
    void increaseSettings();

    /**
     * Decreases the current settings of the object.
     * Implementing classes should define the specific behavior for decreasing the settings.
     */
    void decreaseSettings();
}

