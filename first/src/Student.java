class Student {
    String name;
    long roll;
    int marks;
    String branch = "CS";

    void checkResult() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.checkResult();
        st1.name = "Jeeni";
        st1.roll = 101;
        st1.marks = 90;

        System.out.println("Name: " + st1.name);
        System.out.println("Roll: " + st1.roll);
        System.out.println("Marks: " + st1.marks);
        System.out.println("Branch: " + st1.branch);
        st1.checkResult();
    }
}

