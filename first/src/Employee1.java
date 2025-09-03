class Employee1 {
    int empId;
    String name;
    long salary;
    void calculate(){
        System.out.println("Income : ");
    }

    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        e1.empId=1234;
        e1.name="Tanya";
        e1.calculate();
        System.out.println("e1 employee id is "+e1.empId);
        System.out.println("e1 employee name is "+e1.name);
    }
}
