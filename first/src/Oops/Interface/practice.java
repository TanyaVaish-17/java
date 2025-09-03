package Oops.Interface;
abstract class Order{
    int orderId;
    double amount;
    Order(int orderId,double amount){
        this.orderId=orderId;
        this.amount=amount;
    }
    void generateBill(){
        System.out.println("A bill of "+amount+ "for orderId "+orderId);
    }
    abstract void processOrder();
}
interface Cancelable{
    void cancelOrder(int orderId);
}
interface Discountable{
    void applyDiscount(double percent);
}
class OnlineOrder extends Order implements Cancelable,Discountable{
    OnlineOrder(int orderId,double amount){
        super(orderId,amount);
    }
    @Override
    void processOrder(){
        System.out.println("Your Online order has been processed with amount "+amount);
    }
    @Override
    public void cancelOrder(int orderId){
        System.out.println("Your order "+orderId+" has been cancelled!");
    }
    @Override
    public void applyDiscount(double percent){
        System.out.println("You have given a discount of "+percent);
    }
}
class DineInOrder extends Order implements Discountable{
    DineInOrder(int orderId,double amount){
        super(orderId,amount);
    }
    @Override
    void processOrder(){
        System.out.println("Your Dine in order has been processed with amount "+amount);
    }
    @Override
    public void applyDiscount(double percent){
        System.out.println("You have given a discount of "+percent);
    }
}
class TakeAwayOrder extends Order{
    TakeAwayOrder(int orderId,double amount){
        super(orderId,amount);
    }
    @Override
    void processOrder(){
        System.out.println("Your Take Away Order has been processed with amount "+amount);
    }
}
public class practice {
    public static void main(String[] args) {
        OnlineOrder p1= new OnlineOrder(111,5000.50);
        DineInOrder p2= new DineInOrder(112,8050.30);
        TakeAwayOrder p3=new TakeAwayOrder(113,5023.45);
        p1.processOrder();p1.generateBill();
        p2.processOrder();p2.generateBill();
        p3.processOrder();p3.generateBill();
        p1.cancelOrder(111);
        p1.applyDiscount(20);
        p2.applyDiscount(12);
    }
}
