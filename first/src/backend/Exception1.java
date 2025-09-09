package backend;
//an object is created by the main memory which includes exception, description, stack track
//if the exception is not been handled ,jvm will print the message called as default exception handler.
import java.io.*;
// we can write t/c/f inside try, catch and final all.
public class Exception1 {
    public static void main(String[] args) {
        try { //risky code
            FileReader fr = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception handled: File not found.");
        }
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled: Division by zero.");
        }
    }
}

