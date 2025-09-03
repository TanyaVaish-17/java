class Employee2 {
    protected String name;
    protected double baseSalary;
    public Employee2(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }
}
class Manager extends Employee2 {
    private double allowance;
    public Manager(String name, double baseSalary, double allowance) {
        super(name, baseSalary);
        this.allowance = allowance;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + allowance;  // manager gets allowance
    }
}
class Programmer extends Employee2 {
    private double overtimePay;
    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}
public class lab3_10 {
    public static void main(String[] args) {
        Employee2 e1 = new Manager("Tanya", 1000000, 15000);
        Employee2 e2 = new Programmer("Utkarsh", 5000000, 10000);
        System.out.println(e1.name + "'s Salary: " + e1.calculateSalary());
        System.out.println(e2.name + "'s Salary: " + e2.calculateSalary());
    }
}
