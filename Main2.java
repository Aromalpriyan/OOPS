public class Main2 {
    public static void main(String[] args) {
        SmartDevice mobile = new SmartDevice();
        mobile.brand = "iphone";
        mobile.model = "16proMax";
        mobile.batterylife = 85;
        mobile.connect();
        mobile.displayStatus();

    }
}

