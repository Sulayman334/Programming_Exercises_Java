package Chapter_10_OOP.Polymorphism.SmartHomeAutomationSystem;

public class Camera extends SmartDevice {

    /*
     * The Camera class represents a smart camera device that can start and stop recording.
     * It extends the SmartDevice class, inheriting basic device functionality like
     * turning on or off. This class also adds specific behaviors related to recording.
     */

        /**
         * Indicates whether the camera is currently recording.
         */
        protected boolean isRecording;

        /**
         * Constructs a new Camera object.
         *
         * @param deviceName  The name of the camera device.
         * @param isOn        The initial state of the camera (whether it is powered on or off).
         * @param isRecording The initial recording state of the camera.
         */
        public Camera(String deviceName, boolean isOn, boolean isRecording) {
            // Call the constructor of the superclass SmartDevice
            super(deviceName, isOn);
            // Initialize the recording state
            this.isRecording = isRecording;
        }

        /**
         * Starts recording with the camera.
         * Sets the recording state to true and prints a message indicating the camera is recording.
         */
        void startRecording() {
            isRecording = true;
            System.out.println("Camera is recording");
        }

        /**
         * Stops recording with the camera.
         * Sets the recording state to false and prints a message indicating the camera has stopped recording.
         */
        void stopRecording() {
            isRecording = false;
            System.out.println("Camera has stopped recording");
        }

        /**
         * Toggles the recording functionality of the camera.
         * If the camera is recording, it will stop recording. If the camera is not recording,
         * it will start recording. This method overrides the performFunction() method from the
         * SmartDevice class.
         */
        @Override
        void performFunction() {
            // Check the current recording state and toggle accordingly
            if (isRecording) {
                stopRecording();
            } else {
                startRecording();
            }
    }



}
