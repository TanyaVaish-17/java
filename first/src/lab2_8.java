import java.util.Scanner;

class Room {
    private int roomNo;
    private String roomType;
    private double roomArea;
    private boolean acMachine;
    public void setData(int roomNo, String roomType, double roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }
    public void displayData() {
        System.out.println("Room Number : " + roomNo);
        System.out.println("Room Type   : " + roomType);
        System.out.println("Room Area   : " + roomArea + " sq.ft");
        System.out.println("AC Machine  : " + (acMachine ? "Yes" : "No"));
    }
}
public class lab2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        int no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Room Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Room Area (sq.ft): ");
        double area = sc.nextDouble();
        System.out.print("Is AC available? (true/false): ");
        boolean ac = sc.nextBoolean();
        Room r1 = new Room();
        r1.setData(no, type, area, ac);
        System.out.println("\n--- Room Details ---");
        r1.displayData();
        sc.close();
    }
}
