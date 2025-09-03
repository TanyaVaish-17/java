package Oops.Polymorphism;
class A1{
    void m1(){
        System.out.println("m1");
    }
}
class B1 extends A1{
    void m2(){
        System.out.println("m2");
    }
}
public class Dpoly1 {
    public static void main(String[] args) {
        System.out.println("A");
        A1 b1=new B1();
        b1.m1();
    }
}
