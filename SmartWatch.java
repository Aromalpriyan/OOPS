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