package backend;

import java.io.*;

public class Exception1 {
    public static void main(String[] args) {
        try {
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

