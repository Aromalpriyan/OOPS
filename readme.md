# <p>OOPS - Object Oriented Programming System<p>
### <p>OOPS is a programming style that uses objects.<p>
#### <p>1. Classes<p>
#### <p>2. Objects<p>
#### <p>3. Constructers<p>

### <p>1. Three Modifiors<p>
#### <p>1. Public<p>
#### <p>2. Private<p>
#### <p>3. Default<p> 
#### <p>OOPS is a way to organise your code by creating objects that represent real world entites.<p>
### <p>2. What is a class ?<p>
#### <p>A class is a blue print or template for creating objects.<p>
### <p>properties || Attributes<p>
### <p>methods()<p>
### <p>1. Public<p>
#### <p>The word public indicates that this class can be access from other parts of the programme.<p>
### <p>3. Member Variables && Member Methods<p>
#### <p>Members are items or parts that are inside of a class.<p>
## <p>Examples<p>
### <p>1.Class/Objects<p>
#### Class_BluePrint
```
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
```
#### Main2_Objects
```
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
```
### <p>2. Class/Objects/Constructor
#### Class_BluePrint
```
public class SmartWatch {
// properties
    String brand;
    String model;
    int price = 2599;
    boolean isDigital=false;

    public SmartWatch(String myBrand, String myModel){
        System.out.println("New watch has been created");
        brand = myBrand;
        model = myModel;
    }

    void productInfo(){
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
        System.out.println("isDigital: " + isDigital);
    }
        
}
```
#### Main_Objects/Constructor
```
public class Main {
    public static void main(String[] args) {
        
        SmartWatch watch1 = new SmartWatch("boat", "boat nirvana701");
        watch1.productInfo();

        SmartWatch watch2 = new SmartWatch("boult", "boult 805c");
        watch2.productInfo();
    }
}
```
[githublink](https://github.com/Aromalpriyan/OOPS)
