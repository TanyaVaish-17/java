import java.util.Scanner;
public class stringOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.nextLine();
        int countChar=0;
        System.out.println("Number of character in string are : "+s.length());
        StringBuilder sb = new StringBuilder(s);
        String reversedString = sb.reverse().toString();
        System.out.println("Reversed String : "+reversedString);
        System.out.println("Is it Palindrome : "+ s.equals(reversedString));
    }
}
