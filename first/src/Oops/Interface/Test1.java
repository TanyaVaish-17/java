// if there is only 1 method in interface then it is called functional interface
//if there is none, then it is called marker interface
//by default variable in interface is public static final
//all method inside the interface are public and abstract
package Oops.Interface;
interface Inter1{
    int x=112;
    void method1();
}
interface Inter2{
    int x=115;
    void method3();
}
public class Test1 implements Inter1,Inter2 {
    public static void main(String[] args) {
        System.out.println("Main Entry Point");
        System.out.println(Inter1.x);
        int x=113;
        System.out.println(x);
    }
    public void method1(){
        System.out.println("This is my method1");
    }
    public void method3(){
        System.out.println("This is my method3");
    }
}
