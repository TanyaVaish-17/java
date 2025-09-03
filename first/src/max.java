import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int maxNum=num1;
        if (num2>maxNum){
            maxNum=num2;
        }
        if (num3>maxNum) {
            maxNum = num3;
        }
        System.out.println("Greatest of 3 numbers : "+maxNum);
    }
}
