package Oops.Interface;
abstract class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void showDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
    abstract void study();
}
interface Sports {
    void playSport();
}

interface Music {
    void playInstrument();
}

interface Coding {
    void writeCode();
}

class EngineeringStudent extends Student implements Coding {
    EngineeringStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    void study() {
        System.out.println(name + " studies Engineering subjects.");
    }

    @Override
    public void writeCode() {
        System.out.println(name + " writes Java code.");
    }
}

class ArtsStudent extends Student implements Music {
    ArtsStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    void study() {
        System.out.println(name + " studies Arts subjects.");
    }

    @Override
    public void playInstrument() {
        System.out.println(name + " plays Guitar.");
    }
}

class SchoolStudent extends Student implements Sports {
    SchoolStudent(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    void study() {
        System.out.println(name + " studies school subjects.");
    }

    @Override
    public void playSport() {
        System.out.println(name + " plays Football.");
    }
}
public class Test6 {
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent("Amit", 101);
        ArtsStudent s2 = new ArtsStudent("Priya", 102);
        SchoolStudent s3 = new SchoolStudent("Rahul", 103);

        s1.showDetails(); s1.study();
        s2.showDetails(); s2.study();
        s3.showDetails(); s3.study();

        s1.writeCode();
        s2.playInstrument();
        s3.playSport();
    }
}
