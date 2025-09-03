import java.io.*;
import java.util.Scanner;
class Employee {
    private int empNo;
    private String empName;
    private int empBasic;
    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }
    public int getEmpNo() {
        return empNo;
    }
    public String getEmpName() {
        return empName;
    }
    public int getEmpBasic() {
        return empBasic;
    }
    @Override
    public String toString() {
        return empNo + "," + empName + "," + empBasic;
    }
    public static Employee fromString(String str) {
        String[] parts = str.split(",");
        int no = Integer.parseInt(parts[0]);
        String name = parts[1];
        int basic = Integer.parseInt(parts[2]);
        return new Employee(no, name, basic);
    }
}
public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee No: ");
        int empNo = sc.nextInt();sc.nextLine();
        System.out.print("Enter Employee Name: ");String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");int empBasic = sc.nextInt();
        Employee emp = new Employee(empNo, empName, empBasic);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emp.txt"))) {
            writer.write(emp.toString());
            System.out.println("\nEmployee details saved to emp.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("emp.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                Employee empFromFile = Employee.fromString(line);
                System.out.println("\n--- Employee Details from File ---");
                System.out.println("Employee No   : " + empFromFile.getEmpNo());
                System.out.println("Employee Name : " + empFromFile.getEmpName());
                System.out.println("Basic Salary  : " + empFromFile.getEmpBasic());
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        sc.close();
    }
}
