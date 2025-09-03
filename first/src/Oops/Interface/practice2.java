package Oops.Interface;
abstract class Appliance{
    String brand;
    String model;
    Appliance(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void ShowDetails(){
        System.out.println("Details of the Model are : ");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
    }
    abstract void getPowerConsumption();
}
interface Warranty{
    void getWarrantyPeriod(int years);
}
interface Connectable{
    void connectToWifi();
}
class Referigerator extends Appliance implements Warranty{
    Referigerator(String brand,String model){
        super(brand,model);
    }
    @Override
    void getPowerConsumption(){
        System.out.println("Referigerator Power Consumption is 123.45");
    }
    @Override
    public void getWarrantyPeriod(int years){
        System.out.println("Referigerator with brand "+brand+" and model "+model+" is "+years);
    }
}
class SmartTV extends Appliance implements Warranty,Connectable{
    SmartTV(String brand,String model){
        super(brand,model);
    }
    @Override
    void getPowerConsumption(){
        System.out.println("SmartTV Power Consumption is 789.00");
    }
    @Override
    public void getWarrantyPeriod(int years){
        System.out.println("Smart TV with brand "+brand+" and model "+model+" is "+years);
    }
    @Override
    public void connectToWifi() {
        System.out.println("Connect to wifi for Smart TV");
    }
}
class WashingMachine extends Appliance implements Warranty{
    WashingMachine(String brand,String model){
        super(brand,model);
    }
    @Override
    void getPowerConsumption(){
            System.out.println("Washing Machine has a power consumption of 45.789");
    }
    @Override
    public void getWarrantyPeriod(int years){
        System.out.println("Washing Machine with brand "+brand+"and model "+model+" is "+years);
    }
}
public class practice2 {
    public static void main(String[] args) {
        Referigerator p1=new Referigerator("b1","m1");
        SmartTV p2=new SmartTV("b2","m2");
        WashingMachine p3=new WashingMachine("b3","m3");
        p1.getPowerConsumption();p1.ShowDetails();
        p2.getPowerConsumption();p2.ShowDetails();
        p3.getPowerConsumption();p3.ShowDetails();
        p1.getWarrantyPeriod(5);
        p2.getWarrantyPeriod(3);
        p2.connectToWifi();
    }
}
