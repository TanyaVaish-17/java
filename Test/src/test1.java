abstract class Ride{
    int bookingId;
    int cost;
    Ride(int bookingId,int cost){
        this.bookingId=bookingId;
        this.cost=cost;
    }
    void showDetails(){
        System.out.println("BookingId : "+bookingId+" and Cost of ride : "+cost);
    }
    abstract void processRide();
}
interface cancelRide{
    void refund();
}
interface scheduleRide{
    void schedule(String time);
}
class Cab extends Ride implements cancelRide{
    Cab(int bookingId,int cost){
        super(bookingId,cost);
    }
    @Override
    void processRide(){
        System.out.println("Your Train Ticket of id : "+bookingId+" and cost : "+cost+" is confirmed");
    }
    @Override
    public void refund(){
        System.out.println("Refund of "+cost+" has been done for order id "+bookingId);
    }
}
class Train extends Ride implements cancelRide,scheduleRide{
    Train(int bookingId,int cost){
        super(bookingId,cost);
    }
    @Override
    void processRide(){
        System.out.println("Your Train ride of is : "+bookingId+" and cost : "+cost+" has been confirmed");
    }
    @Override
    public void refund(){
        System.out.println("Refund of "+cost+" has been done for id : "+bookingId);
    }
    @Override
    public void schedule(String time){
        System.out.println("Your bus ride has been rescheduled at "+time);
    }
}
class Bus extends Ride{
    Bus(int bookingId,int cost){
        super(bookingId,cost);
    }
    @Override
    void processRide(){
        System.out.println("Your Bus Ride of id : "+bookingId+" and cost : "+cost+" has been confirmed");
    }
}
public class test1 {
    public static void main(String[] args) {
        Cab p1=new Cab(111,120);
        Train p2= new Train(345,908);
        Bus p3= new Bus(234,765);
        p1.processRide();p1.showDetails();
        p2.processRide();p2.showDetails();
        p3.processRide();p3.showDetails();
        try {
            p1.refund();
            p2.refund();
            p2.schedule("12 : 00 pm");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
