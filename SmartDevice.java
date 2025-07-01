public class SmartDevice {
// properties || attributes
    String brand;
    String model;
    int batterylife = 0;
    boolean isConnected = false;

// member methods that allow us to connect and disconnect the device
    void connect(){
        isConnected = true;
    }

    void disconnect(){
        isConnected = false;
    }
// another method to display the information about the smartDevice
    void displayStatus(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batterylife);
        System.out.println("Connected: " + isConnected);
    }
}

