import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int maxValue=a[0];
        int minValue=a[0];
        for (int i=0;i<n;i++){
            if (a[i]<minValue){
                minValue=a[i];
            }
            if (a[i]>maxValue){
                maxValue=a[i];
            }
        }
        System.out.println("Largest in array : "+maxValue);
        System.out.println("Smallest in array : "+minValue);
    }
}
