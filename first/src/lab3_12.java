class Employee3 {
    private int empNo;
    private String empName;
    private int empBasic;
    public Employee3(int empNo, String empName, int empBasic) {
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
}
public class lab3_12 {
    public static void main(String[] args) {
        Employee3 e1 = new Employee3(101, "Tanya", 50000);
        System.out.println("Employee2 No   : " + e1.getEmpNo());
        System.out.println("Employee2 Name : " + e1.getEmpName());
        System.out.println("Basic Salary  : " + e1.getEmpBasic());
    }
}
