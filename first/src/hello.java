import java.util.Scanner;
public class hello
{
    public static void main(String[] args) {
        System.out.println("hello");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
class Aa{
    public static void main(String[] args) {
        System.out.println("Aa data");
        hello.main(new String[] {"Hello","World"});
    }
}
